package praktikum1;
public class GraphMain11 {
    public static void main(String[] args) {
        Graph11 gedung = new Graph11(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();
        gedung.removeEdge(1, 3);
        gedung.printGraph();

        while (true) {
            gedung.checkPath();
            System.out.println();
        }
    }
}
