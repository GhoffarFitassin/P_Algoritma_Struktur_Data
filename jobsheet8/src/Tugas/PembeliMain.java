package Tugas;

import java.util.Scanner;

public class PembeliMain {
    public static void menu() {
        System.out.println("Pilih menu: ");
        System.out.println("1. Pembeli baru");
        System.out.println("2. Pembeli Keluar");
        System.out.println("3. Cek Pembeli terdepam");
        System.out.println("4. Cek Semua Pembeli");
        System.out.println("5. Cek Pembeli paling belakang");
        System.out.println("------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int n = sc.nextInt();
        Queue antri = new Queue(n);
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("No HP: ");
                    int noHP = sc.nextInt();
                    Pembeli nb = new Pembeli(nama, noHP);
                    sc.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Pembeli data = antri.Dequeue();
                    if (!" ".equals(data.nama) && data.noHP != 0) {
                        System.out.println("Antrian yang keluar: "+ data.nama + " " + data.noHP);
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.daftarPembeli();
                    break;
                case 5:
                    antri.peekRear();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
