package org.codewithre;

import java.util.Scanner;

public class jaraktempuh {
    public static void main(String[] args) {
        int kecepatan, waktu, jarak;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukkan kecepatan kendaraan (km/jam): ");
        kecepatan = keyboard.nextInt();
        while(kecepatan < 0){
            System.out.println("Kecepatan tidak bisa negatif. Masukkan kembali kecepatan.");
            System.out.print("Masukkan kecepatan kendaraan (km/jam): ");
            kecepatan = keyboard.nextInt();
        }

        System.out.print("Masukkan waktu tempuh (jam): ");
        waktu = keyboard.nextInt();
        while(waktu <= 1){
            System.out.println("Waktu tempuh harus lebih besar dari atau sama dengan 1 jam. Masukkan kembali waktu tempuh.");
            System.out.print("Masukkan waktu tempuh (jam): ");
            waktu = keyboard.nextInt();
        }
        System.out.println("Waktu (jam)\tJarak (km)");
        for(int i = 1; i <= waktu; i++){
            jarak = kecepatan*i;
            System.out.printf("%-11d\t%6d\n", i,jarak);
        }
    }
}
