package praktikum1;
public class Node11 {
    int data;
    Node11 prev, next;
    int jarak;

    Node11(Node11 prev, int data, int jarak, Node11 next){
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak = jarak;
    }
}
