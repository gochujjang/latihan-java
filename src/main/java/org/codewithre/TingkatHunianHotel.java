package org.codewithre;

import java.util.Scanner;

public class TingkatHunianHotel {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // inisialisasi variable
        int jmlLantai, jmlKamar, durasi;
        int totalKamar = 0, totalDurasi = 0;
        double tingkatHunian;

        try {
            // input lantai
            System.out.print("Masukkan banyaknya lantai kamar hotel: ");
            jmlLantai = keyboard.nextInt();

            // input kamar per lantai
            System.out.print("Masukkan banyaknya kamar perlantai: ");
            jmlKamar = keyboard.nextInt();

            //check jumlah kamar & lantai
            if (jmlLantai <= 0) {
                throw new RuntimeException("Input invalid, Tidak ada lantai yang tersedia.");
            } else if (jmlKamar <= 0) {
                throw new RuntimeException("Input invalid, Tidak ada kamar yang tersedia.");
            }

            // iterasi lantai
            for (int lt = 1; lt <= jmlLantai; lt++) {
                // validasi lantai angker
                if (!(lt == 4 || lt == 13 || lt == 14)){
                    System.out.println("Lantai " + lt);
                }else{
                    System.out.println("Lantai " + lt + " tidak tersedia...");
                    lt++;
                    System.out.println("Lantai " + lt);
                }
                // iterasi nomor kamar
                for (int noKamar = 1; noKamar <= jmlKamar; noKamar++) {
                    // validasi kamar angker
                    if (!(noKamar == 3 || noKamar == 4 || noKamar == 13 || noKamar == 14))
                    {
                        System.out.print("Masukkan lama huni kamar selama sebulan untuk kamar [" + noKamar + "]: ");
                        durasi = keyboard.nextInt();
                        // check value durasi agar tidak bernilai 0
                        if (durasi < 0) {
                            throw new IllegalArgumentException("Lama huni tidak bisa bernilai negatif");
                        }

                        totalDurasi += durasi;
                        totalKamar++;
                    }else{
                        System.out.println("Kamar nomor ["+noKamar+"] tidak tersedia...");
                    }
                }
            }

            // hitung rata rata tingkat hunian
            tingkatHunian = (double) totalDurasi / (totalKamar * 30);

            // print output
            System.out.println("");
            System.out.println("Total Kamar: "+totalKamar);
            System.out.printf("Tingkat Hunian Hotel: %.2f", tingkatHunian);
        }catch (java.util.InputMismatchException e) {
            System.out.println("Masukkan input berupa angka integer...");
        }catch (IllegalArgumentException e){
            System.out.println("Terjadi IllegalArgumentException: " + e.getMessage());
        } finally {
            keyboard.close();
        }
    }
}