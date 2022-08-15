package com.dicoding.javafundamental.collection;

import java.util.*;

public class SetPlanet {
    public static void main(String[] args) {
        // Menggunakan HashSet
        Set<String> planets = new HashSet<>();
        planets.add("Mercury"); // Method add() untuk menambahkan objek ke Set
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Earth"); // Menambahkan objek "Earth" beberapa kali
        planets.add("Earth");
        planets.add("Mars"); // Objek bisa terus ditambahkan ke Set

        // Method size() untuk mendapatkan ukuran Set
        System.out.println("Set planets awal: (size = " + planets.size() + ")");
        for (String planet : planets) {
            System.out.println("\t " + planet);
        }

        planets.remove("Venus"); // Method remove() untuk mengeluarkan objek dari Set

        System.out.println("Set planets akhir: (size = " + planets.size() + ")");
        for (Iterator iterator = planets.iterator(); iterator.hasNext(); ) {
            // Looping menggunakan iterator
            System.out.println("\t " + iterator.next());
        }
    }
}

/*
Penyimpanan pada Set tidak teratur
 */