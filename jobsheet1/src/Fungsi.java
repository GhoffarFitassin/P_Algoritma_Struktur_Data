import java.util.Scanner;

public class Fungsi {
    // Data
    static String[] topDtTable = { "Aglonema", "Keladi", "Alocasia", "Mawar" };
    static long[] harga = { 75000, 50000, 60000, 10000 };
    static long[][] stock = {
            { 10, 5, 15, 7 },
            { 6, 11, 9, 12 },
            { 2, 10, 10, 5 },
            { 5, 7, 12, 9 } };
    static long[] stockMati = { 1, 2, 0, 5 };
    static String[] cabToko = new String[stock.length];

    // Data Table Awal
    public static void dtAwal(String[] dtBaris, String[] dtKolom, long[][] dtBunga) {
        System.out.printf("%-20s", "Nama Cabang");
        for (int i = 0; i < dtKolom.length; i++) {
            System.out.printf("%-15s", dtKolom[i]);
        }
        System.out.println();

        for (int i = 0; i < dtBunga.length; i++) {
            System.out.printf("%-20s", dtBaris[i]);
            for (int j = 0; j < dtBunga.length; j++) {
                System.out.printf("%-15s", dtBunga[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    // Data Table Omset Penjualan
    public static void dtOmset(String[] dtBaris, String[] dtKolom, long[][] dtBunga, long[] harga) {
        System.out.printf("%-20s", "Nama Cabang");
        for (int i = 0; i < dtKolom.length; i++) {
            System.out.printf("%-15s", dtKolom[i]);
        }
        System.out.printf("%-15s", "Total");
        System.out.println();

        long[][] totOmset = new long[dtBunga.length][harga.length];
        long total = 0;
        for (int i = 0; i < dtBunga.length; i++) {
            System.out.printf("%-20s", dtBaris[i]);
            for (int j = 0; j < dtBunga.length; j++) {
                totOmset[i] = getOmset(dtBunga[i], harga);
                System.out.printf("%-15s", totOmset[i][j]);
            }
            for (int x = 0; x < totOmset.length; x++) {
                total += totOmset[i][x];
            }
            System.out.println(total);
        }
        System.out.println();
    }

    // Perhitungan Omset
    public static long[] getOmset(long[] stock, long[] harga) {
        long[] arr = new long[harga.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stock[i] * harga[i];
        }
        return arr;
    }

    // Data Tabel RoyalGarden4
    public static void dtRGMati(String[] dtBaris, String[] dtKolom, long[][] dtBunga, long[] dtstockMati, int index) {
        System.out.println("Stock Asli:");
        System.out.printf("%-20s", "Nama Cabang");
        for (int i = 0; i < dtKolom.length; i++) {
            System.out.printf("%-15s", dtKolom[i]);
        }
        System.out.println();

        System.out.printf("%-20s", dtBaris[index]);
        for (int j = 0; j < dtBunga.length; j++) {
            System.out.printf("%-15s", dtBunga[index][j]);
        }
        System.out.println();
        System.out.println();

        System.out.println("Stock Mati:");
        System.out.printf("%-20s", "Nama Cabang");
        for (int i = 0; i < dtKolom.length; i++) {
            System.out.printf("%-15s", dtKolom[i]);
        }
        System.out.println();

        System.out.printf("%-20s", dtBaris[index]);
        for (int j = 0; j < dtBunga.length; j++) {
            System.out.printf("%-15s", dtstockMati[j]);
        }
        System.out.println();
        System.out.println();

        System.out.println("Stock Yang Berkurang:");
        System.out.printf("%-20s", "Nama Cabang");
        for (int i = 0; i < dtKolom.length; i++) {
            System.out.printf("%-15s", dtKolom[i]);
        }
        System.out.println();

        long[] dtStockKurang = new long[dtBunga[index].length];
        System.out.printf("%-20s", dtBaris[index]);
        for (int x = 0; x < dtStockKurang.length; x++) {
            dtStockKurang[x] = dtBunga[index][x] - dtstockMati[x];
            System.out.printf("%-15s", dtStockKurang[x]);
        }
        System.out.println();
    }

    public static void menu(int pilihan) {
        try {
            switch (pilihan) {
                case 1 ->{ // Data Omset
                    System.out.println("\t\t\t\t<<======= Data Omset Toko =======>>");
                    dtOmset(cabToko, topDtTable, stock, harga);
                }

                case 2 ->{ // Data RoyalGarden4
                System.out.println("\t\t\t<<======= RoyalGarden4 =======>>");
                dtRGMati(cabToko, topDtTable, stock, stockMati, 3);
                }

                default -> {
                    System.out.println("Menu Tidak Tersedia");
                }
            }
        } catch (Exception e) {
            System.out.println("Harus Angka!!!");
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int pil;

        for (int i = 0; i < cabToko.length; i++) {
            cabToko[i] = "RoyalGarden" + (i + 1);
        }
        // Data Mentah
        System.out.println("\t\t\t<<======= Data Awal =======>>");
        dtAwal(cabToko, topDtTable, stock);

        System.out.println("==========================================");
        System.out.println("Menu");
        System.out.println("Pertanyaan 1");
        System.out.println("Pertanyaan 2");
        System.out.print("Pilih Menu: ");
        pil = inp.nextInt();
        System.out.println("==========================================");
        menu(pil);
        
    }
}