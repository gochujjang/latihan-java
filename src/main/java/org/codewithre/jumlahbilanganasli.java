package org.codewithre;

import java.util.Scanner;

public class jumlahbilanganasli {
    public static void main(String[] args) {
        int n;
        int j = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan n: ");
        n = keyboard.nextInt();

        for (int i=1; i <= n; i++){
            j += i;
        }
        System.out.println("Jumlah bilangan asli dari 1 s.d "+n+" = "+j);
    }
}
