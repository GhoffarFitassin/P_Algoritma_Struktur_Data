package Searching;
import java.util.Scanner;

public class BukuMain11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku11 data = new PencarianBuku11();
        int jumBuku = 5;

        System.out.println("-----------------------------------------------");
        System.out.println("Masukkan data Buku secara Urut dari KodeBuku Terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("----------------------");
            System.out.print("Kode Buku\t: ");
            int kodeBuku = s.nextInt();
            System.out.print("Judul buku\t: ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit\t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang\t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stock\t\t: ");
            int stock = s.nextInt();

            Buku m = new Buku(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("-----------------------------------------------");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();

        System.out.println("_______________________________________________");
        System.out.println("_______________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Kode Buku yang dicari: ");
        System.out.print("Kode Buku : ");
        int cari = s.nextInt();
        System.out.println("==============================");
        // System.out.println("menggunakan sequential Search");
        // int posisi = data.FindSeqSearch(cari);
        // data.TampilPosisi(cari, posisi);
        // data.TampilData(cari, posisi);
        try {
            Buku dataBuku = data.FindBuku(cari);
            dataBuku.tampilDataBuku();
        } catch (Exception e) {
            System.out.println("data : " + cari + " tidak ditemukan");
        }

    }
}
