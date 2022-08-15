package com.dicoding.javafundamental.inputoutput;

import java.util.Scanner;

/*
Scanner merupakan kelas yang menyediakan fungsi-fungsi untuk membaca dan mengambil input dari pengguna.
Scanner memiliki kemudahan yang dapat membaca teks, baik yang memiliki tipe Data Primitif maupun String.
 */

public class InputOUtputFunction {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program penjumlahan sangat sederhana");
        System.out.print("Masukkan Angka Pertama: ");
        int value = scanner.nextInt();
        System.out.println("Msukkan Angka Kedua: ");
        int anotherValue = scanner.nextInt();
        int result = value + anotherValue;
        System.out.println("Hasilnya adalah: " + result);
    }
}

/*
Adapun catatan yang harus diperhatikan adalah pengunaan fungsi Scanner.
Pengamnbilan data sangat bergantung pada tipe data yang dimasukkan.
Ini harus sesuai, misalnya untuk String, panggilah Scanner.next()
Jika data yang diinputkan Integer, panggilah Scanner.nextInt().
Jika input tidak sesuai, program akan menemui error.
 */
