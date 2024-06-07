package praktikum2;
import java.util.*;

public class Graph11 {
    int vertex;
    DoubleLinkedList11 list[];

    public Graph11(int v) {
        vertex = v;
        list = new DoubleLinkedList11[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList11();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
    }

    public void degree(int asal) {
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            // inDegree
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    ++totalIn;
                }
            }
            // outDegree
            for (k = 0; k < list[asal].size(); k++) {
                list[asal].get(k);
            }
            totalOut = k;
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalIn + totalOut));
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
    }

    public void removeEdge(int asal, int tujuan) {
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list[asal].remove(tujuan);
            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
            System.out.println("Graf berhasil dikosongkan");
        }
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + "m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public boolean isPath(int asal, int tujuan) {
        boolean[] visited = new boolean[vertex];
        Stack<Integer> stack = new Stack<>();
        stack.push(asal);

        while (!stack.isEmpty()) {
            int current = stack.pop();

            if (current == tujuan) {
                return true;
            }

            if (!visited[current]) {
                visited[current] = true;

                for (int i = 0; i < list[current].size(); i++) {
                    int neighbor = list[current].get(i);
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }

        return false;
    }

    public void checkPath() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan gedung asal: ");
        int asal = scanner.nextInt();

        System.out.print("Masukkan gedung tujuan: ");
        int tujuan = scanner.nextInt();

        if (isPath(asal, tujuan)) {
            System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " bertetangga");
        } else {
            System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " tidak bertetangga");
        }
    }
}
