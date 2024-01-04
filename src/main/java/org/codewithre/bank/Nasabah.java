package org.codewithre.bank;

public class Nasabah {
    public static void main(String[] args) {
        // membuat objek Bank
        Bank mandiri = new Bank("Mandiri", "349842394", 5000000);

        // Menampilkan informasi awal nasababh dari objek yang sudah dibuat
        System.out.println("Bank "+ mandiri.getNamaBank());
        System.out.println("No Rekening "+ mandiri.getNoRekening());
        System.out.println("Saldo awal anda: " + mandiri.getSaldo());
        System.out.println("");
        // melakukan deposit dengan melempar argumen nominalnya
        mandiri.depo(300000);
        // melakukan tarik saldo dengan melempar argumen nominalnya
        mandiri.tarik(1000000);
    }
}
