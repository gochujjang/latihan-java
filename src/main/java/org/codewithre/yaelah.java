package org.codewithre;
// [1] Import class Scanner


/*
    Program ini meminta dua angka riil dari pengguna
    lalu menghitung dan menampilkan nilai rata-rata
    dari dua angka tersebut.
*/

import java.util.Scanner;

public class yaelah {
    public static void main(String[] args) {
        // [2] Deklarasikan variabel untuk menyimpan angka 1, angka 2, dan rata-rata
        double angka1, angka2;
        double rerata;

        // [3] Buat object Scanner
        Scanner keyboard = new Scanner(System.in);


        // [4] Prompt pengguna untuk memasukkan angka 1 dan simpan ke variabel
        System.out.print("Masukkan angka pertama: ");
        angka1 = keyboard.nextDouble();


        // [5] Prompt pengguna untuk memasukkan angka 2 dan simpan ke variabel
        System.out.print("Masukkan angka kedua: ");
        angka2 = keyboard.nextDouble();

        // [6] Hitung rata-rata
        rerata = (double)(angka1 + angka2) / 2;


        // [7] Tampilkan rata-rata dengan pembulatan dua desimal
        System.out.printf("Rata-rata = %.2f", rerata);
    }
}
