package org.codewithre;
// [1] Import class Scanner
import java.util.Scanner;

/*
    Program ini meminta pengguna memasukkan nilai a, b, dan c, lalu
    menghitung akar x1 dan x2 dari persamaan kuadrat ax^2 + bx + c = 0.
*/

public class modifinp {
    public static void main(String[] args) {
        // [2] Deklarasikan a, b, c untuk menyimpan input pengguna
        int a, b, c;

        // [3] Deklarasikan x1 dan x2 untuk menyimpan akar persamaan kuadrat
        double x1, x2;

        // [4] Buat object scanner dan referensikan ke variabel keyboard
        Scanner keyboard = new Scanner(System.in);

        // [5] Prompt pengguna untuk mendapatkan nilai a
        System.out.print("Masukkan nilai a: ");
        a = keyboard.nextInt();


        // [6] Prompt pengguna untuk mendapatkan nilai b
        System.out.print("Masukkan nilai b: ");
        b = keyboard.nextInt();


        // [7] Prompt pengguna untuk mendapatkan nilai c
        System.out.print("Masukkan nilai c: ");
        c = keyboard.nextInt();




        // [8] Hitung dua akar persamaan kuadrat
        x1 = (-b + Math.sqrt(Math.pow(b,2) - (4*a*c))) / (2 * a);
        x2 = (-b - Math.sqrt(Math.pow(b,2) - (4*a*c))) / (2 * a);



        // [9] Tampilkan akar persamaan kuadrat
        System.out.printf("x1 = %.2f", x1);
        System.out.println("");
        System.out.printf("x2 = %.2f", x2);
    }
}
