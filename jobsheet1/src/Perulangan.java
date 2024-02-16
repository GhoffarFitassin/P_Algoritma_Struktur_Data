import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String NIM;

        System.out.println("==========================================");
        System.out.println("Program Deret Bilangan");
        System.out.println("==========================================");
        System.out.print("Masukkan NIM Anda: ");
        NIM = inp.nextLine();

        // Mengambil Nilai n
        int n = Integer.parseInt(NIM.substring(NIM.length() - 2));
        if (n < 10) {
            n += 10;
        }
        System.out.println("Nilai n = " + n);
        System.out.println("==========================================");

        // output
        System.out.println("==========================================");
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            } else if (i % 2 == 1) {
                System.out.print("* ");
            } else {
                System.out.print(i+" ");
            }
        }
    }
}
