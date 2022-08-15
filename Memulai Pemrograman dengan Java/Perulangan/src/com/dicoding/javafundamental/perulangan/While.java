package com.dicoding.javafundamental.perulangan;

public class While {
    public static void main(String[] args) {
        int value = 1; // Mendeklarasikan variabel nilai dengan angka 1.
        while (value <= 10) { // Pengecekan suatu kondisi pada variabel. Apabila nilai lebih kecil atau sama dengan 10.
            // Melakukan sebuah perintah apabila kondisi terpenuhi.
            System.out.print("Angka : " + value);
            value++;
            System.out.print("\n");
        }
    }
}
