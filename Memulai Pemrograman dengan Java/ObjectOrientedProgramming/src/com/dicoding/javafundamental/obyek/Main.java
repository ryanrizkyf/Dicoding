package com.dicoding.javafundamental.obyek;

public class Main {
    public static void main(String[] args) {
        // Menciptakan Object dengan nama "obyekHewan"
        Hewan Elang = new Hewan("Elang");
        Hewan Kucing = new Hewan("Kucing");

        Elang.beratHewan(5);
        Elang.jumlahKakiHewan(2);
        Elang.cetakHewan();

        Kucing.beratHewan(2);
        Kucing.jumlahKakiHewan(4);
        Kucing.cetakHewan();
    }
}

/*
Dalam sebuah kelas bisa menciptakan beberapa obyek.
Dengan menggunakan obyek dapat mengeksekusi baik metode maupun fungsi yang beraneka ragam,
yang dipakai dalam sebuah kelas
 */