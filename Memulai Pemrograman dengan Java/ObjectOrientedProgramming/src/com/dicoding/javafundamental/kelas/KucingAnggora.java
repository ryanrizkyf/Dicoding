package com.dicoding.javafundamental.kelas;

public class KucingAnggora {
    // Class body

    /*
    // Ini adalah contoh No-Argument Constructor
    public KucingAnggora() {
    }
    */

    String namaKucing;
    int beradBadan;

    // Ini adalah contoh Parameterized Constructor
    // Dengan memberikan nilai awal data member nama_kucing dan berat_badan
    // Dengan parameter yang kita tentukan
    public KucingAnggora(String nama, int berat) {
        namaKucing = nama;
        beradBadan = berat;
    }
}
