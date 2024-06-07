package praktikum2;

public class GraphMatriks11 {
    int vertex;
    int[][] matriks;

    public GraphMatriks11(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = 0;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + " m), ");
                }
            }
            System.out.println();
        }
    }

    public void degree(int asal) {
        int t = 0, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            // inDegree
            for (int j = 0; j < matriks[i].length; j++) {
                if (matriks[i][j] == asal) {
                    ++totalIn;
                }
            }
            // outDegree
            for (int k = 0; k < matriks[asal].length; k++) {
                if (matriks[asal][k] > 0) {
                    t++;
                }
            }
            totalOut = t;
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalIn + totalOut));
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
    }
}
