package com.dicoding.javafundamental.perulangan;

/* Bentuk umum pernyataan For
for (initialization; termination; increment) {
    statement(s)
}
 */

public class For {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Angka : " + i);
        }
    }
}


/* int i = 1
Kita membuat variabel dengan tipe data integer yang kita sebut sebagai initialization.
Menginisialisasi angka dimulai dari 1
 */

/* i <= 10
Menentukan batasan nilai akhir suatu perulangan atau disebut dengan termination.
Contoh di atas adalah angka lebih kecil atau sama dengan 10.
 */

/* i++
menentukan aksi terhadap perulangan, aksi tersebut bisa menaikkan (increment) atau menurunkan (decrement).
Apabila kita ingin melakukan aksi increment maka nilai awal (initialization) harus lebih kecil daripada nilai akhir (termination).
Begitupun sebaliknya, jika melakukan aksi menurun maka nilai awal (initialization) harus lebih besar daripada nilai akhir (termination).
Seperti contoh di atas kita melakukan aksi increment.
 */