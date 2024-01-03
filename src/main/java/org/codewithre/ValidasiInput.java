package org.codewithre;

import java.util.Scanner;

public class ValidasiInput {
    public static void main(String[] args) {
        int angka;
        Scanner keyboard = new Scanner(System.in);


        // Minta angka bulat 1 s.d 4
        System.out.print("Masukkan angka bulat antara 1 s.d 4: ");
        angka = keyboard.nextInt();

        // Minta pengguna memasukkan angka bulat 1 s.d 4 kembali
        // jika pengguna memasukkan angka yang salah.
        while(angka < 1 || angka > 4){
            System.out.println("Angka yang Anda masukkan salah. Silahkan masukkan kembali.");
            System.out.print("Masukkan angka bulat antara 1 s.d 4: ");
            angka = keyboard.nextInt();
        }
        System.out.println("Angka yang Anda masukkan valid.");
    }
}
