package com.dicoding.javafundamental.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListPlanet {
    public static void main(String[] args) {
        // Deklarasi Array
        String[] heroes = new String[2];
        heroes[0] = "Riki";
        heroes[1] = "Sven";
        // heroes[2] = "Zeus"; // error ArrayIndexOutOfBoundsException karena ukuran Array tetap

        // Menggunakan ArrayList
        List<String> planets = new ArrayList<>();
        planets.add("Mercury"); // Method add() untuk menambahkan objek ke List
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars"); // Objek lainnya masih bisa terus ditambahkan ke List

        System.out.println("List planets awal :");
        for (int i = 0; i < planets.size(); i++) { // Method size() untuk mendapatkan ukuran List
            // Method get() untuk melihat isi List pada index 1
            System.out.println("\t index-" + i + " = " + planets.get(i));
        }

        planets.remove("Venus"); // Method remove() untuk mengeluarkan objek dari List

        System.out.println("List planets akhir: ");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("\t index-" + i + " = " + planets.get(i));
        }
    }
}

/*
Penyimpanan pada List teratur
 */
