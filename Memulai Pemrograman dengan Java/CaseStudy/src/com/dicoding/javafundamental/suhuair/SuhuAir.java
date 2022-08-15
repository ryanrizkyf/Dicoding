/*
Studi Kasus:
Implementasi Pernyataan If
 */

package com.dicoding.javafundamental.suhuair;

import java.util.Scanner;

public class SuhuAir {
    // Membuat static metode main
    public static void main(String[] args) {
        /* Contoh pemakaian IF tiga kasus: Wujud Air */

        /* Kamus */
        int T;

        /* Program */
        System.out.println("Contoh IF tiga kasus");
        System.out.print("Suhu (der. C) = ");

        // Scanner untuk memasukkan suhu air
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt(); // Memasukkan suhur air dengan tipe int

        // Proses pengecekkan dengan IF
        if (T < 0) {
            System.out.println("Wujud air beku " + T);
        } else if ((0 < T) && (T <= 100)) {
            System.out.print("Wujud air cair " + T);
        } else if (T > 100) {
            System.out.print("Wujud air uap/gas " + T);
        }
    }
}
