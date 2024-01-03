package org.codewithre;

import java.util.Scanner;

public class penjualantiket {
    public static void main(String[] args) {
        // Membuat objek scanner untuk input keyboard pengguna
        Scanner keyboard = new Scanner(System.in);

        // Deklarasi variabel jumlahTiket, pembeli, dan beliTiket yang bertipe data integer
        // Variabel jumlahTiket memiliki nilai 10, variabel pembeli memiliki nilai 0
        int jumlahTiket = 10, pembeli = 0, beliTiket;

        // Deklarasi variabel konstanta TIKET_MAKSIMAL_PER_ORANG yang bertipe data integer dan bernilai 4
        final int TIKET_MAKSIMAL_PER_ORANG = 4;

        // Menggunakan statement while untuk
        // melakukan perulangan pembelian tiket sampai tiket habis terjual
        while (jumlahTiket > 0) {



            // Mendapatkan nilai variabel beliTiket dari pengguna
            System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
            beliTiket = keyboard.nextInt();


            // Kondisi apabila tiket yang dibeli kurang dari tiket maksimal per orang
            if (beliTiket > 0 && beliTiket <= TIKET_MAKSIMAL_PER_ORANG){
                // Kondisi apabila tiket yang terjual masih tersedia
                if (beliTiket <= jumlahTiket) {
                    pembeli++;
                    jumlahTiket -= beliTiket;
                    System.out.println("Anda membeli sebanyak " + beliTiket + " tiket.");
                    if (jumlahTiket > 0){
                        System.out.println("Sisa tiket yang tersedia: " + jumlahTiket);
                    }
                } else {
                    System.out.println("Maaf, sisa tiket yang tersisa adalah "+jumlahTiket+" tiket.");
                }
            }else{
                System.out.println("Anda tidak bisa membeli lebih dari "+TIKET_MAKSIMAL_PER_ORANG+" tiket.");
            }


            // Kondisi apabila tiket habis terjual
            if (jumlahTiket == 0) {
                System.out.println("Semua tiket telah terjual kepada "+pembeli+" pembeli.");
            }

        }
    }
}
