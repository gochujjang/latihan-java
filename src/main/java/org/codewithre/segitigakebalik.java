package org.codewithre;
import java.util.Scanner;


public class segitigakebalik {
    public static void main(String[] args) {
        int n;
        // Membuat object Scanner
        Scanner keyboard = new Scanner(System.in);

        // Minta pengguna memasukkan nilai n
        // n dalam bentuk angka
        System.out.print("Masukkan nilai n: ");
        n = keyboard.nextInt();

        // Loop pertama dengan kondisi jika 'i' sama dengan 'n'
        // selama 'i' lebih besar dari 0
        // 'i' didekrementasi
        for (int i = n; i >= 0; i--){
            // Loop kedua dengan kondisi jika 'j' sama dengan 0
            // selama 'j' lebih kecil dari 'i'
            // 'j' diinkrementasi
            for (int j = 0; j < i; j++){
                // Cetak '*'
                System.out.print("*");
            }
            // Cetak String kosong untuk baris baru
            System.out.println();
        }
    }
}
