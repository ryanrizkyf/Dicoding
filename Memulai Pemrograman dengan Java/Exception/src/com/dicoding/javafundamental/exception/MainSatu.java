package com.dicoding.javafundamental.exception;

import java.io.File;
import java.io.FileReader;

public class MainSatu {
    public static void main(String[] args) {
        try {
            // Mencoba membaca berkas latihan.txt
            File file = new File("D://latihan.txt");
            FileReader fr = new FileReader(file);
            // Jika berhasil maka tampilkan pesan
            System.out.println("Read file berhasil");
        } catch (Exception e) {
            // Jika terjadi kesalahan maka tampilkan pesan
            System.out.println(e.getMessage());
        }
    }
}

/*
Kita asumsikan ada 2 skenario yang bisa terjadi ketika kode di atas dijalankan.
Pertama, ada berkas latihan.txt di drive d: dan program berhasil membaca berkasnya.
Kedua, berkas latihan.txt tidak ada di drive d:.
 */

/*
Dari output di atas maka dapat disimpulkan bahwa kode untuk menampilkan pesan “Read file berhasil” tidak dijalankan
karena terjadi exception ketika mencoba membaca berkas latihan.txt.
Program akan langsung menuju ke block catch dan menampilkan pesan penyebab dari erornya.
 */