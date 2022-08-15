package com.dicoding.javafundamental.inputoutput;

import java.io.File;

public class FileNavigation {
    public static void main(String[] args) {
        String dirname = "/java/latihan1";
        // File file = new File(dirname);
        File file = null;
        String[] paths;

        try {
            // Instansiasi objek File
            file = new File(dirname);

            // Ambil list files dan masukkan ke string paths
            paths = file.list();

            // Tampilkan semua path yang ada
            for (String path : paths) {
                System.out.println(path);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Buat directory
        // file.mkdirs();
    }
}

/*
Dengan memanfaatkan mkdir dan list,
kita bisa membuat program yang dapat melakukan navigasi ke directories di dalam storage.
 */