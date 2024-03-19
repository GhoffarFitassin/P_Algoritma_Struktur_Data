package praktikum;

public class MainShowroom {
    static void printTable(){
        String table ="+---------------------------------------------------------------------+\n" +
        "| Merk       | Tipe            | Tahun | Top Acceleration | Top Power |\n" +
        "+---------------------------------------------------------------------+\n" +
        "| BMW        | M2 Coupe        | 2016  | 6816             | 728       |\n" +
        "| Ford       | Fiesta ST       | 2014  | 3921             | 575       |\n" +
        "| Nissan     | 370Z            | 2009  | 4360             | 657       |\n" +
        "| Subaru     | BRZ             | 2014  | 4058             | 609       |\n" +
        "| Subaru     | Impreza WRX STI | 2013  | 6255             | 703       |\n" +
        "| Toyota     | AE86 Trueno     | 1986  | 3700             | 553       |\n" +
        "| Toyota     | 86/GT86         | 2014  | 4180             | 609       |\n" +
        "| Volkswagen | Golf GTI        | 2014  | 4180             | 631       |\n" +
        "+---------------------------------------------------------------------+\n";
        System.out.println(table);
    }
    public static void main(String[] args) {
        int[] acceleration={6816, 3921, 4360, 4058, 6255, 3700, 4180, 4180};
        int[] power={728, 575, 657, 609, 703, 553, 609, 631};
        Showroom sr = new Showroom(acceleration, power);
        printTable();
        System.out.println("Top Acceleration tertinggi: "+(sr.highest_Acceleration()));
        System.out.println("Top Acceleration terendah: "+(sr.lowest_Acceleration()));
        System.out.println("Rata-rata Top Power: "+(sr.rata_power()));

    }
}
