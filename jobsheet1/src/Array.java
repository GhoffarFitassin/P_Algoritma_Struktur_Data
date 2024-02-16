import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String huruf="";
        float bobot=0;
        String matkul[] = { "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja" };
        int sks[] = { 2, 2, 2, 3, 2, 2, 3, 2 };
        int nilAngka[] = new int[matkul.length];
        String nilHuruf[] = new String[matkul.length];
        float nilSetara[] = new float[nilHuruf.length];

        System.out.println("==========================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==========================================");

        // Input Nilai Angka
        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + matkul[i] + " : ");
            nilAngka[i] = inp.nextInt();
        }

        // konversi Nilai Angka ke Nilai huruf & Nilai Setara
        for (int i = 0; i < nilHuruf.length; i++) {
            if (nilAngka[i] <= 100 && nilAngka[i] > 80) {
                huruf = "A";
                bobot = 4f;
            } else if (nilAngka[i] <= 80 && nilAngka[i] > 73) {
                huruf = "B+";
                bobot = 3.5f;
            } else if (nilAngka[i] <= 73 && nilAngka[i] > 65) {
                huruf = "B";
                bobot = 3f;
            } else if (nilAngka[i] <= 65 && nilAngka[i] > 60) {
                huruf = "C+";
                bobot = 2.5f;
            } else if (nilAngka[i] <= 60 && nilAngka[i] > 50) {
                huruf = "C";
                bobot = 2f;
            } else if (nilAngka[i] <= 50 && nilAngka[i] > 39) {
                huruf = "D";
                bobot = 1f;
            } else if (nilAngka[i] <= 39) {
                huruf = "E";
                bobot = 0f;
            }
            nilHuruf[i] = huruf;
            nilSetara[i] = bobot;
        }

        // Output Hasil Konversi Nilai
        System.out.println("==========================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==========================================");
        System.out.printf("%-40s%-20s%-20s%-20s\n", "MatKul", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < nilAngka.length; i++) {
            System.out.printf("%-40s%-20s%-20s%-20s\n", matkul[i], nilAngka[i], nilHuruf[i], nilSetara[i]);
        }

        // Perhitungan IP Semester
        float totalNilai = 0f;
        for (int i = 0; i < nilAngka.length; i++) {
            totalNilai += nilSetara[i] * sks[i];
        }
        // System.out.println(totalNilai);
        
        int totalSKS = 0;
        for (int x : sks) {
            totalSKS += x;
        }
        float ip = totalNilai / totalSKS;

        System.out.println("==========================================");
        System.out.printf("IP : %.2f\n", ip);
        System.out.println("==========================================");
    }
}
