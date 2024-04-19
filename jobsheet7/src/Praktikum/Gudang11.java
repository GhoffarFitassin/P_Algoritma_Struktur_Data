package Praktikum;

import java.util.Scanner;

public class Gudang11 {
    Barang11[] tumpukan;
    int size;
    int top;

    public Gudang11(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang11[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;    
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang11 brg) {
        if (!cekPenuh()) {
        top++;
        tumpukan [top] = brg;
        System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
        System.out.println("Gaga1! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang11 ambilBarang() {
        if (!cekKosong()) {
            Barang11 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang");
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan Barang Kosong.");
            return null;
        }
    }

    public Barang11 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang11 barangTeratas = tumpukan[top];
            System.out.println("Barang Teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan Barang Kosong.");
            return null;
        }
    }
    
    public Barang11 lihatBarangTerbawah() {
        if (!cekKosong()) {
            Barang11 barangTeratas = tumpukan[0];
            System.out.println("Barang Teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan Barang Kosong.");
            return null;
        }
    }

    public void cariBarang(String cari) {
        if (!cekKosong()) {
            for (int i = 0; i <= top; i++) {
                if (tumpukan[i].kode == Integer.parseInt(cari) || tumpukan[i].nama.equals(cari)) {
                    System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                            tumpukan[i].kategori);
                    break;
                }
            }
        } else {
            System.out.println("tumpukan barang kosong");
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang  di Gudang");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan Barang Kosong.");
        }
    }

    public String konversiDesimalKeBiner(int kode){
        StackKonversi stack = new StackKonversi();
        while(kode != 0){
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while(!stack.isEmpty()){
            biner += stack.pop();
        }
        return biner;
    }
}
