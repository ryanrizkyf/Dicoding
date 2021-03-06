# -*- coding: utf-8 -*-
"""Dicoding-Submission-2-PengembanganMachineLearning.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/16PpjS0N2bjKYWCUpPuR7MTDhKHDut6ET

Nama   : Ryan Rizky Fathinanto
    Email  : ryanrizkyf@gmail.com
    No. HP : 085692475682
"""

import numpy as np
import pandas as pd
import tensorflow as tf
import matplotlib.pyplot as plt
import matplotlib.dates as mdates
from keras.layers import Dense, LSTM

df = pd.read_csv('/content/GE.csv')
df.head()

df.isnull().sum()

df

plt.clf()
fig, ax = plt.subplots(figsize=(18, 8))
plt.plot(df['Date'], df['Close'], color='slategray')
fig.suptitle('General Electric (GE) Stock Price\nJanuary 1962 - June 2021', 
             y=1.05, fontsize=20, fontweight='bold', ha='center')
ax.set_xlabel('')
ax.set_ylabel('Harga (USD)', fontsize=14)
ax.text(1, -0.1, 'Sumber: Yahoo Finance', color='blue',
        ha='right', transform=ax.transAxes, fontsize=14)

ax.xaxis.set_major_locator(mdates.MonthLocator())
ax.xaxis.set_major_formatter(mdates.DateFormatter('%b %Y'))

plt.grid(axis='y')
plt.ylim(ymin=0)
labels, locations = plt.yticks()
plt.yticks(labels, (labels).astype(int))
plt.tight_layout()
plt.show()

from sklearn.model_selection import train_test_split

X_train, X_test, y_train, y_test = train_test_split(df['Date'], df['Close'], test_size=0.2, shuffle=False)
print(len(X_train), len(X_test), len(y_train), len(y_test))

def windowed_dataset(series, window_size, batch_size, shuffle_buffer):
    series = tf.expand_dims(series, axis=1)
    ds = tf.data.Dataset.from_tensor_slices(series)
    ds = ds.window(window_size + 1, shift=1, drop_remainder=True)
    ds = ds.flat_map(lambda w: w.batch(window_size + 1))
    ds = ds.shuffle(shuffle_buffer)
    ds = ds.map(lambda w: (w[:-1], w[-1:]))
    return ds.batch(batch_size).prefetch(1)

data_train = windowed_dataset(y_train, window_size=60, batch_size=32, shuffle_buffer=1000)
data_val = windowed_dataset(y_test, window_size=60, batch_size=32, shuffle_buffer=1000)

model = tf.keras.models.Sequential([
                                    tf.keras.layers.Bidirectional(tf.keras.layers.LSTM(64)),
                                    tf.keras.layers.Dense(64, activation='relu'),
                                    tf.keras.layers.Dense(1),
])

class myCallback(tf.keras.callbacks.Callback):
  def on_epoch_end(self, epoch, logs={}):
    if(logs.get('mae')<0.1):
      print("\nMAE telah mencapai <10%!")
      self.model.stop_training = True
callbacks = myCallback()

optimizer = tf.keras.optimizers.Adam(learning_rate=1.0000e-04)

model.compile(loss=tf.keras.losses.MeanAbsoluteError(),
              optimizer=optimizer,
              metrics=['mae'])

num_epochs=100
hist = model.fit(data_train,
                 epochs=num_epochs,
                 validation_data=(data_val),
                 callbacks=[callbacks],
                 batch_size=128)

plt.plot(hist.history['loss'])
plt.title('Model Loss')
plt.ylabel('Loss')
plt.xlabel('Epoch')
plt.legend(['Train'], loc='upper right')
plt.show()