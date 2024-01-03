package org.codewithre;

import java.util.Scanner;

public class olahdata {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double angka, max, min;
        double rerata = 0.0;
        int counter = 0;
        double totalRata = 0.0;

        System.out.print("Masukkan angka floating point positif (-1 untuk mengakhiri): ");
        angka = keyboard.nextDouble();

        max = angka;
        min = angka;

        while(angka != -1){

            if (max < angka){
                max = angka;
            }
            if (min > angka){
                min = angka;
            }

            totalRata += angka;
            System.out.print("Masukkan angka floating point positif (-1 untuk mengakhiri): ");
            angka = keyboard.nextDouble();
            counter++;
        }

        rerata = totalRata / counter;


        if (max != -1 && min != -1){
            System.out.printf("Rata-rata = "+rerata);
            System.out.println();
            System.out.println("Maksimum = "+max);
            System.out.println("Minimum = "+min);
            System.out.println("Selisih Maks dan Min = "+(max-min));
        }

    }
}
