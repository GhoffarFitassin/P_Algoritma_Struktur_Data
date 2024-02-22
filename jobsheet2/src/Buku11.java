public class Buku11 {

    String judul, pengarang;
    int halaman, stok, harga;
    int jumlah, total, diskon;

    public Buku11() {

    }

    public Buku11(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman:" + halaman);
        System.out.println("Sisa stok" + stok);
        System.out.println("Harga: Rp" + harga);
    }

    void terjual(int jml) {
        if (stok <= 0) {
            System.out.println("Stock Habis!");
        } else {
            jumlah = jml;
            stok -= jml;
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    int gantiHarga(int hrg) {
        return harga = hrg;
    }

    int hitungHargaTotal() {
        return total = harga * jumlah;
    }

    int hitungDiskon() {
        if (total > 150000) {
            return diskon = (int) (total * 0.12);
        } else if (total > 75000) {
            return diskon = (int) (total * 0.05);
        } else {
            return diskon = 0;
        }
    }

    int hitungHargaBayar() {
        return total -= diskon;
    }
}
