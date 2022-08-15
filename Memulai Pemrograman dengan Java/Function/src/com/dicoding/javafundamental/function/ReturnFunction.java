package com.dicoding.javafundamental.function;

public class ReturnFunction {
    public static void main(String[] args) {
        double p = 7;
        double l = 6.5;
        double hasil = hitungLuas(p, 1); // Memanggil fungsi
        System.out.println("Hasilnya adalah = " + hasil);
    }

    // Funsgi dengan nilai balik
    public static double hitungLuas(double panjang, double lebar) {
        double luas = panjang * lebar;
        return luas;
    }
}

/*
Secara umum, penamaan fungsi diawali dengan huruf kecil
dan diikuti dengan huruf besar setelahnya.
Hal ini biasa disebut dengan notasi "Punuk Unta"
Contoh:
- luas
- hitungKeliling
- hapusUser
- rataNilaiMahasiswa
 */
