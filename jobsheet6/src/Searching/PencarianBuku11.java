package Searching;
public class PencarianBuku11 {
    Buku listBk[] = new Buku[5];
    int idx;

    void tambah(Buku m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    public void tampil() {
        for (Buku m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku == cari) {
                i = posisi;
                break;
            }
        }
        return posisi;
    }

    public void TampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data : " + x + " tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Kode buku\t :" + x);
            System.out.println("Judul\t :" + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t :" + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t :" + listBk[pos].pengarang);
            System.out.println("Stock\t :" + listBk[pos].stock);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }


}
