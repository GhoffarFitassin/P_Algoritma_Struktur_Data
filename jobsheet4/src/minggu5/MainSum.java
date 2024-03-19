package minggu5;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah perusahaan : ");
        int jlmCabang = sc.nextInt();
        Sum sm[] = new Sum[jlmCabang];

        for (int i = 0; i < sm.length; i++) {
            System.out.println("Cabang Perusahaan ke-"+(i+1));
            System.out.print("Masukkan jumlah bulan : ");
            int jlmBulan = sc.nextInt();
            sm[i] = new Sum(jlmBulan);
            
            System.out.println("===============================================================");        
            for (int j = 0; j < sm[i].elemen; j++) {
                System.out.print("Masukkan untung bulan ke - "+(j+1)+" = ");
                sm[i].keuntungan[j] = sc.nextDouble(); 
            }
        }

        System.out.println("Total Keuntungan Tiap Cabang Perusahaan");
        for (int i = 0; i < sm.length; i++) {
            System.out.println("Cabang Perusahaan ke-"+(i+1));
            System.out.println("===============================================================");
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama "+sm[i].elemen+" bulan adalah = "+sm[i].totalBF(sm[i].keuntungan));   
            System.out.println("==============================================================="); 
            System.out.println("Algoritma Brute Force");   
            System.out.println("Total keuntungan perusahaan selama "+sm[i].elemen+" bulan adalah = "+sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen-1));
            
        }
        
    }
}
