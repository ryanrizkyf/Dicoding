package com.dicoding.javafundamental.percabangan;

public class SwitchWithoutBreak {
    public static void main(String[] args){
        char input = 'C';
        int output = 0;
        switch (input) {
            case 'A':
                output++;
            case 'B':
                output++;
            case 'C':
                // Program akan menjalankan kode di dalam case ini
                output++; // Output = 1

                // Karena di akhir case C tidak ada break, maka program akan menjalankan case selanjutnya
            case 'D':
                // Kode ini akan dijalankan oleh program
                output++; // Output = 2
            case 'E':
                // Kode ini akan dijalankan oleh program
                output++; // Output = 3
            default:
                // Case default juga akan dijalankan
                output++; // Output = 4
        }
        System.out.println("Nilai akhirnya adalah " + output);
    }
}
