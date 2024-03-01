import java.util.Scanner;

public class bangunRuangMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        bangunRuang[] kerucut = new bangunRuang[3];
        bangunRuang[] Limas = new bangunRuang[3];
        bangunRuang[] Bola = new bangunRuang[3];

        System.out.println("Bangun Ruang Kerucut");
        for (int i = 0; i < kerucut.length; i++) {
            kerucut[i] = new bangunRuang();
            System.out.println("Kerucut ke-" + (i + 1));
            System.out.print("Jari-jari : ");
            kerucut[i].jariJari = in.nextInt();
            System.out.print("sisi : ");
            kerucut[i].sisiMiring = in.nextInt();
        }

        for (bangunRuang bangunRuang : kerucut) {
            System.out.println("Luas Permukaan Kerucut : " + bangunRuang.hitungLPKerucut());
            System.out.println("Volume Kerucut : " + bangunRuang.hitungVKerucut());
        }

        System.out.println();

        System.out.println("Bangun Ruang Limas");
        for (int i = 0; i < Limas.length; i++) {
            Limas[i] = new bangunRuang();
            System.out.println("Limas ke-" + (i + 1));
            System.out.print("Alas : ");
            Limas[i].alas = in.nextInt();
            System.out.print("Tinggi : ");
            Limas[i].tinggi = in.nextInt();
        }

        for (bangunRuang bangunRuang : Limas) {
            System.out.println("Luas Permukaan Limas : " + bangunRuang.hitungLPLimas());
            System.out.println("Volume Limas : " + bangunRuang.hitungVLimas());
        }

        System.out.println();

        System.out.println("Hitung Bola");
        for (int i = 0; i < Bola.length; i++) {
            Bola[i] = new bangunRuang();
            System.out.println("Bola ke-" + (i + 1));
            System.out.print("Jari-jari : ");
            Bola[i].jariJari = in.nextInt();
        }

        for (bangunRuang bangunRuang : Bola) {
            System.out.println("Luas Permukaan Bola : " + bangunRuang.hitungLPBola());
            System.out.println("Volume Bola : " + bangunRuang.hitungVBola());
        }

        in.close();
    }
}

