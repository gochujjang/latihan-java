package org.codewithre;

public class tabelperkalian {
    public static void main(String[] args) {
        int row = 10;
        int col = 10;
        for (int i = 1; i <= row; i++){
            for (int j = 1; j <= col; j++){
                int kali = i * j;
                System.out.printf("%3d  ", kali);
            }
            System.out.println();
        }
    }
}
