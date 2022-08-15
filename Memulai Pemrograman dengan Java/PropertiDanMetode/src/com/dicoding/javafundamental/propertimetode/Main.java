package com.dicoding.javafundamental.propertimetode;

public class Main {
    public static void main(String[] args) {
        // Menambahkan 1 argumen dengan nilai int 2
        // Nilai tersebut adalah nilai yang digunakan untuk inisiasi variabel umur
        Hewan kucing = new Hewan(2);
        kucing.makan();
        kucing.jalan();
        kucing.lari();

        // Contoh penggunaan fungsi getUmur
        System.out.println("Umurnya adalah " + kucing.getUmur());

        // Perhitungan indeks masa tubuh (BMI)
        // berat (kg) / ( tinggi (m) * tinggi (m) )
        double bmi = kucing.getBerat() / ((kucing.getTinggi() * 0.01) * (kucing.getTinggi() * 0.01));
        System.out.println("Indeks massa tubuhnya adalah " + bmi);

        /*
        Dari kode di atas ada 2 contoh penggunaan fungsi:
        1. Pemanggilan fungsi getUmur() yang langsung ditampilkan ke dalam output.
        Tipe data yang dikembalikan adalah int.
        2. Perhitungan indeks massa tubuh dengan menggunakan fungsi getBerat() dan getTinggi().
        Tipe data yang dikembalikan adalah double.
         */
    }
}

/*
Tidak ada batasan dalam penulisan nama metode atau fungsi.
Akan tetapi jangan lupakan penulisan yang dianjurkan (code conventions).
Pertama, nama metode haruslah kata kerja dengan huruf kecil (lower case).
Kalau terdiri lebih dari 1 kata, penulisan dimulai dari kata kerja dengan huruf kecil
dan diikuti dengan kata benda yang huruf pertamanya adalah besar/kapital.
Ada beberapa contoh yang bisa Anda lihat berikut ini:
- lari()
- jalan()
- setUmur()
- getUmur()
- isEmpty()
 */
