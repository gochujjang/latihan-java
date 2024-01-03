package org.codewithre;

import java.util.Scanner;

public class gkjelas {
    public static void main(String[] args) {
        int angka1, angka2, jumlah;
        char pilihan;

        Scanner keyboard = new Scanner(System.in);

        do
        {
            System.out.print("Masukkan angka 1: ");
            angka1 = keyboard.nextInt();

            System.out.print("Masukkan angka 2: ");
            angka2 = keyboard.nextInt();

            jumlah = angka1 + angka2;

            System.out.println("Jumlah = " + jumlah);

            System.out.println("Apakah Anda ingin melakukan ini kembali (Y atau N)? ");
            pilihan = keyboard.next().charAt(0);

        } while (pilihan == 'Y');
    }
}
