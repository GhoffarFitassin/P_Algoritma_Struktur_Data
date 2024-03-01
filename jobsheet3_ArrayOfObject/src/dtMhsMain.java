import java.util.Scanner;

public class dtMhsMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        dtMhs[] data = new dtMhs[3];

        for (int i = 0; i < 3; i++) {
            data[i] = new dtMhs();
            System.out.println("Masukkan data Mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama : ");
            data[i].nama = in.next();
            System.out.print("Masukkan nim : ");
            data[i].nim = in.next();
            System.out.print("Masukkan jenis kelamin : ");
            data[i].jenisKelamin = in.next().charAt(0);
            System.out.print("Masukkan ipk : ");
            data[i].ipk = in.nextDouble();
        }

        System.out.println();
        
        for (int i = 0; i < data.length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("nama : " + data[i].nama);
            System.out.println("nim : " + data[i].nim);
            System.out.println("jenis kelamin : " + data[i].jenisKelamin);
            System.out.println("ipk : " + data[i].ipk);
        }

        double avg = 0;
        for (int i = 0; i < data.length; i++) {
            avg += data[i].ipk;
        }
        avg /= data.length;
        System.out.println("\nRata-rata IPK: " + (float) avg);

        double ipkTerbesar = 0;
        for (int i = 0; i < data.length; i++) {
            if (ipkTerbesar < data[i].ipk)
                ipkTerbesar = data[i].ipk;
        }
        System.out.println("IPK Terbesar: " + ipkTerbesar);

        in.close();
    }
}
