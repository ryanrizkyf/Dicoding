package com.dicoding.javafundamental.obyek;

public class Hewan {
    String nama;
    int berat;
    int jumlahKaki;

    // Ini merupakan konstruktor dari kelas hewan
    // Konstruktor adalah method yang pertama kali dijalankan ketika Object diciptakan
    public Hewan(String namaHewan) {
        nama = namaHewan;
    }

    public void beratHewan(int beratHewan) {
        berat = beratHewan;
    }

    public void jumlahKakiHewan(int jumlahKakiHewan) {
        jumlahKaki = jumlahKakiHewan;
    }

    public void cetakHewan() {
        System.out.println("Nama hewan: " + nama);
        System.out.println("Berat hewan: " + berat + " kg");
        System.out.println("Jumlah kaki: " + jumlahKaki);
    }
}

/*
Kelas Hewan memliki beberapa atribut, seperti nama, berat dan jumlah kaki.
Masing-masing dari atribut tersebut diberikan parameter dengan membuat method.
 */
