package com.dicoding.javafundamental.function;

public class InputFunction {
    public static void main(String[] args) {
        // Memanggil fungsi
        hitungLuas(7, 6.5);
    }

    /*
    Pada kode di bawah membuat fungsi hitungLuas dengan menggunakan
    parameter serta tidak memberikan nilai bailik. Maka dari itu
    menggunakan void. Kemudian fungsi dipanggil dengan memberikan
    nilai pada masing-masing parameter serta dipisahkan oleh
    tanda koma (,).
    */
    public static void hitungLuas(double panjang, double lebar) {
        double luas;
        luas = panjang * lebar;
        System.out.println(luas);
    }

}
