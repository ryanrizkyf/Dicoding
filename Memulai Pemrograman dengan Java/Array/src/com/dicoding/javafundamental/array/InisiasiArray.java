package com.dicoding.javafundamental.array;

public class InisiasiArray {
    public static void main(String[] args){
        /* CARA 1
        int[] arrInt = new int[]{1, 2, 3, 4, 5, 6};
         */

        /* CARA 2
        int[] arrInt = new int[6];
        arrInt[0] = 1;
        arrInt[1] = 2;
        arrInt[2] = 3;
        arrInt[3] = 4;
        arrInt[4] = 5;
        arrInt[5] = 6;
         */

        // CARA 1
        // Menghilangkan kata NEW + tipe data
        int[] arrInt = {1, 2, 3, 4, 5, 6};

        System.out.println(arrInt[0]);
        System.out.println(arrInt[1]);
        System.out.println(arrInt[2]);
        System.out.println(arrInt[3]);
        System.out.println(arrInt[4]);
        System.out.println(arrInt[5]);
    }
}
