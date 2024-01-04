package org.codewithre.bank;

class Bank {
    // variable instance untuk menyimpan informasi
    private String namaBank;
    private String noRekening;
    private int saldo;
    // konstruktor ketika inisialisasi objek bank
    public Bank(String namaBank, String noRekening, int saldo){
        this.namaBank = namaBank;
        this.noRekening = noRekening;
        this.saldo = saldo;
    }
    // getter nilai namaBank
    public String getNamaBank(){
        return namaBank;
    }
    // setter nilai namaBank
    public void setNamaBank(String namaBank){
        this.namaBank = namaBank;
    }
    // getter nilai noRekening
    public String getNoRekening() {
        return noRekening;
    }
    // setter nilai noRekening
    public void setNoRekening(String noRekening) {
        this.noRekening = noRekening;
    }
    // getter nilai saldo
    public int getSaldo() {
        return saldo;
    }
    // setter nilai saldo
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    // method untuk melakukan deposit
    public void depo(int jumlah){
        // menambahkan nilai parameter ke saldo
        saldo += jumlah;
        System.out.println("Anda melakukan deposit sebesar: "+jumlah);
        System.out.println("Saldo anda saat ini sebesar: "+saldo);

    }
    // method untuk melakukan tarik saldo
    public void tarik(int jumlah){
        // melakukan pengecekan kondisi jika jumlah
        // yang ditarik kurang dari sama dengan saldo
        if (jumlah <= saldo){
            // mengurangi saldo dari nilai parameter
            saldo -= jumlah;
            System.out.println("Anda melakukan tarik saldo sebesar: "+jumlah);
            System.out.println("Saldo anda saat ini sebesar: "+saldo);
        }else{
            System.out.println("Saldo anda tidak cukup");
            System.out.println("Saldo anda saat ini sebesar: "+saldo);

        }
    }
}
