package org.codewithre;

import java.util.Scanner;

public class faktorprima {
    public static void main(String[] args) {
        // Buat object Scanner lalu prompt pengguna dan simpan
        // input pengguna ke variabel n.
        int n;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan asli: ");
        n = keyboard.nextInt();


        // Loop while untuk mencari faktor-faktor prima dari n
        // dengan metode pembagian berulang.
        for (int faktor = 2; faktor <= n; faktor++) {
            while (n % faktor == 0) {
                System.out.println(faktor);
                n /= faktor;
            }
        }
    }
}
