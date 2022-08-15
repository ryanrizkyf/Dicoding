package com.dicoding.javafundamental.perulangan;

public class DoWhile {
    public static void main(String[] args){
        int value = 1; // Mendeklarasikan variabel nilai dengan angka 1
        do {
            // Melakukan sebuah perintah terlebih dahulu
            System.out.println("Angka : " + value);
            value++;
        } while (value <= 10); // Pengecekan suatu kondisi terhadap variabel. Apabila terpenuhi maka perintah dilanjutkan.
    }
}
