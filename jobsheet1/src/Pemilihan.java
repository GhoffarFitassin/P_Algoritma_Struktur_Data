import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        double nilTugas, nilKuis, nilUTS, nilUAS;
        String nilHuruf = "";

        System.out.println("==========================================");
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==========================================");
        System.out.print("Masukkan Nilai Tugas: ");
        nilTugas = inp.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        nilKuis = inp.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        nilUTS = inp.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        nilUAS = inp.nextDouble();
        System.out.println("==========================================");

        // Validasi Nilai
        if (nilTugas < 0 || nilTugas > 100 || nilKuis < 0 || nilKuis > 100 || nilUTS < 0 || nilUTS > 100 || nilUAS < 0
                || nilUAS > 100) {
            System.out.println("==========================================");
            System.out.println("Nilai Tidak Valid!!!");
            System.out.println("==========================================");
            System.out.println("==========================================");
            return;
        }

        // Menghitung Nilai Akhir
        double nilAkhir = (0.2 * nilTugas) + (0.2 * nilKuis) + (0.3 * nilUTS) + (0.3 * nilUAS);

        if (nilAkhir <= 100 && nilAkhir > 80) {
            nilHuruf = "A";
        } else if (nilAkhir <= 80 && nilAkhir > 73) {
            nilHuruf = "B+";
        } else if (nilAkhir <= 73 && nilAkhir > 65) {
            nilHuruf = "B";
        } else if (nilAkhir <= 65 && nilAkhir > 60) {
            nilHuruf = "C+";
        } else if (nilAkhir <= 60 && nilAkhir > 50) {
            nilHuruf = "C";
        } else if (nilAkhir <= 50 && nilAkhir > 39) {
            nilHuruf = "D";
        } else if (nilAkhir <= 39) {
            nilHuruf = "E";
        }

        // Keterangan LULUS/TIDAK LULUS
        if (nilAkhir <= 100 && nilAkhir > 50) {
            System.out.println("==========================================");
            System.out.println(nilAkhir);
            System.out.println(nilHuruf);
            System.out.println("==========================================");
            System.out.println("==========================================");
            System.out.println("LULUS");
        } else {
            System.out.println("==========================================");
            System.out.println("Nilai Akhir: " + nilAkhir);
            System.out.println("Nilai Huruf: " + nilHuruf);
            System.out.println("==========================================");
            System.out.println("==========================================");
            System.out.println("TIDAK LULUS");
        }
    }
}
