package com.dicoding.javafundamental.inputoutput;

/*
Kelas dalam Java ini merupakan paket dari Java.io.BufferedReader dapat digunakan pada materi ini sebagai Basic Input
karena sebenarnya kelas ini tidak hanya digunakan untuk membaca input dari keyboard saja,
melainkan juga untuk mendapatkan input dari user.
Fungsi terakhir ini adalah fungsi dasar BufferedReader yang sama dengan Scanner.

Dalam implementasinya BufferedReader tidak dapat berjalan sendiri.
Untuk mendapatkan input dibutuhkan kelas InputStreamReader.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferedReader {
    public static void main(String[] args){
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        System.out.println("Program Penjumlahan Sangat Sederhana");
        int value = 0;
        int anotherValue = 0;
        try {
            System.out.print("Masukkan Angka Pertama: ");
            value = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Masukkan Angka Kedua: ");
            anotherValue = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int resul = value + anotherValue;
        System.out.println("Hasilnya adalah: " + resul);
    }
}
