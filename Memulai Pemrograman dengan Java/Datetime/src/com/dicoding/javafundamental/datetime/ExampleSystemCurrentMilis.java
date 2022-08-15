package com.dicoding.javafundamental.datetime;

public class ExampleSystemCurrentMilis {
    public static void main(String[] args) {
        long timeNow = System.currentTimeMillis();

        System.out.println("Waktu sekarang adalah " + timeNow + " milisecond");
    }
}

/*
Melalui perintah System.currentTimeMillis();, saat kode diatas dieksekusi,
maka waktu yang didapat saat itu disimpan pada variable timeNow yang bertipe data long.
 */