package org.codewithre;

public class persamaanKuadrat {
    public static void main(String[] args) {
        int a = 2, b = 4, c = -18;

        // [1] Deklarasikan dua variabel untuk menyimpan akar persamaan kuadrat
        double x1, x2;

        // [2] Hitung dua akar persamaan kuadrat
        double disk = Math.pow(b,2) - 4*a*c;

        if (disk > 0){
            x1 = (-b + Math.sqrt(disk)) / (2*a);
            x2 = (-b - Math.sqrt(disk)) / (2*a);
        }else{
            System.out.println("imajiner");
            return;
        }

        // [3] Tampilkan akar persamaan kuadrat
        System.out.println("x1 = "+x1);
        System.out.println("x2 = "+x2);
    }
}
