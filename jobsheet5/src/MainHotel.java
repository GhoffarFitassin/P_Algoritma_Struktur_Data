public class MainHotel {
    public static void main(String[] args) {
        HotelService list = new HotelService();
        Hotel m1 = new Hotel("Nusantara", "Malang", 250000, (byte)3);
        Hotel m2 = new Hotel("Rara Jongrang", "Malang", 190000, (byte)4);
        Hotel m3 = new Hotel("Dompu Aki","Malang", 290000, (byte)5);
        Hotel m4 = new Hotel("Abdul Hamid", "Malang", 230000, (byte)2);
        Hotel m5 = new Hotel("Ummi Salamah", "Malang", 210000, (byte)1);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        // System.out.println("Data harga hotel termurah sampai tertinggi");
        // list.bubbleSort();
        // list.tampilAll();

        System.out.println("Data harga hotel Bintang 5 sampai Bintang 1");
        list.selectionSort();
        list.tampilAll();
    }
}
