public class Main {
    public static void main(String[] args) {
        Segitiga[] sgArray = new Segitiga[3];
        sgArray[0] = new Segitiga(10, 4);
        sgArray[1] = new Segitiga(20, 10);
        sgArray[2] = new Segitiga(15, 6);

        for (int i = 0; i < 3; i++) {
            System.out.println("Luas segitiga ke-" + i + ", " + sgArray[i].hitungLuas());
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Keliling segitiga ke-" + i + ", " + sgArray[i].hitungKeliling());
        }
    }
}
