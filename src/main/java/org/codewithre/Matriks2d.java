package org.codewithre;

import java.util.Scanner;

public class Matriks2d {

    public static void main(String[] args) {
        int[][] matriks = inputMatriks();
        printMatriks(matriks);
    }
    // method input ukuran matriks beserta elemen matriksnya
    public static int[][] inputMatriks() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan ukuran array A : ");
        // input ukuran matriks b
        int a = scanner.nextInt();

        System.out.print("Masukkan ukuran array B : ");
        // input ukuran matriks b
        int b = scanner.nextInt();
        // inisialisasi matriks array 2 dimensi
        int[][] matriks = new int[a][b];

        // iterasi input elemen array 2D
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println("Masukkan elemen matriks[" + i + "][" + j + "] : ");
                matriks[i][j] = scanner.nextInt();
            }
        }

        scanner.close();
        // mengembalikan nilai matriks
        return matriks;
    }
    // method cetak matriks
    public static void printMatriks(int[][] matriks) {
        // Output elemen array 2D
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
    }
}