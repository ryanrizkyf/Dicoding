package com.dicoding.javafundamental.datetime;

import java.util.Calendar;

public class ExampleSpesificCalendar {
    public static void main(String[] args) {

        // Menampilkan waktu sekarang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + calendar.getTime());

        // Menampilkan waktu 15 hari yang lalu
        calendar.add(Calendar.DATE, -15);
        System.out.println("15 hari yang lalu " + calendar.getTime());

        // Menampilkan waktu 4 bulan yang akan datang
        calendar.add(Calendar.MONTH, 4);
        System.out.println("4 bulan kemudian " + calendar.getTime());

        // Menampilkan waktu 2 tahun yang akan datang
        calendar.add(Calendar.YEAR, 2);
        System.out.println("2 tahun kemudian " + calendar.getTime());
    }
}

/*
Salah satu metode yang juga tersedia pada Calendar adalah add() yang memiliki 2 parameter yaitu calendar field dan banyaknya waktu yang ingin ditambahkan.
Seperti pada kode di atas untuk melihat waktu 15 hari yang lalu,
kita bisa gunakan calendar.add(Calendar.DATE, -15) di mana -15 adalah 15 hari yang lalu dari waktu saat ini.
Begitu juga untuk waktu bulan dan tahun.
 */