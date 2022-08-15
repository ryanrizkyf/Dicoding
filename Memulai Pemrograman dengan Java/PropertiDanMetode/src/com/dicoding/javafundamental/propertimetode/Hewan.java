package com.dicoding.javafundamental.propertimetode;

class Hewan{
    // Properti atau fields

    // Inisiasi dengan nilai inisial
    double tinggi = 30;
    double berat = 3;

    // Inisiasi melalui konstruktor
    int umur;

    // Konstruktor dengan parameter
    Hewan(int umur) {
        this.umur = umur;
        /*
        Kode this mereferensikan objek yang sedang digunakan.
        Pemanggilan this ada di dalam konstruktor kelas Hewan.
        Artinya nilai this mereferensikan objek Hewan.
        Kesimpulannya kode this.umur adalah akases ke atribut
        umur kelas Hewan dalam kelas Hewan.
         */
    }

    void lari(){
        System.out.println("Berlari dengan sangat cepat..");
    }
    void jalan(){
        System.out.println("Berjalan dengan pelan..");
    }
    void makan(){
        System.out.println("Makan dengan menggunakan mulut..");
    }
    /*
    Jika diperhatikan, 3 metode di atas menggunakan void sebelum nama metodenya.
    Ini menandakan bahwa metode tersebut tidak memiliki nilai balik.
    Apa itu nilai balik? Nilai balik adalah nilai yang dikirim oleh suatu fungsi.
     */

    double getBerat() {
        return berat;
    }

    double getTinggi() {
        return tinggi;
    }

    int getUmur() {
        return umur;
    }

    /*
    Fungsi getBerat, getTinggi, dan getUmur masing-masing memiliki tipe data sebelum nama fungsinya.
    Ia bisa dilihat secara urut double, double, dan int.
    Tipe data ini menandakan bahwa metode ini akan mengembalikan nilai yang memiliki tipe data tersebut.
     */

    /*
    Kemudian ada penulisan return, yang wajib dituliskan ketika kita membuat suatu fungsi.
    Nilai return yang dikembalikan haruslah memiliki tipe data yang sama dengan tipe data yang dideklarasikan.
    Misalnya getUmur memiliki deklarasi tipe int maka nilai return-nya juga harus memiliki tipe data int.
     */
}