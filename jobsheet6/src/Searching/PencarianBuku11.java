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
                posisi = i;
                break;
            }
        }
        return posisi;
    }
    public Buku FindBuku(int cari) {
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku == cari) {
                return listBk[i];
            }
        }
        return null;
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

    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if (right >= left) {
            mid = left + (right - left) / 2;
            if (cari == listBk[mid].kodeBuku) {
                return mid;
            } else if (listBk[mid].kodeBuku < cari){
                return FindBinarySearch(cari, left, mid -1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}
