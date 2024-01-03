package org.codewithre;

import java.util.Scanner;

public class tersangka {
    public static void main(String[] args) {
        // [2] Deklarasikan variabel untuk menyimpan nama depan dan nama belakang
        String nDepan, nBelakang;

        // [3] Buat object scanner
        Scanner keyboard = new Scanner(System.in);


        // [4] Minta nama depan dengan prompt "Masukkan nama depan: "
        System.out.print("Masukkan nama depan: ");
        nDepan = keyboard.next();


        // [5] Minta nama depan dengan prompt "Masukkan nama belakang: "
        System.out.print("Masukkan nama belakang: ");
        nBelakang = keyboard.next();



        // [7] Tampilkan inisial dengan memanggil suatu method yang dimiliki oleh String
        System.out.println("Inisial: " + nDepan.charAt(0) + nBelakang.charAt(0));
    }
}
