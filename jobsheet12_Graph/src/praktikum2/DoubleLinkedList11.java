package praktikum2;
public class DoubleLinkedList11 {
    Node11 head;
    int size;

    public DoubleLinkedList11() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item, int jarak) {
        if (isEmpty()) {
            head = new Node11(null, item, jarak, null);
        } else {
            Node11 newNode = new Node11(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int item, int jarak) {
        if (isEmpty()) {
            addFirst(item, jarak);
        } else {
            Node11 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node11 newNode = new Node11(current, item, jarak, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int item, int index, int jarak) {
        if (isEmpty()) {
            addFirst(item, jarak);
        } else if (index < 0 || index > size) {
            // throw new Exception("Nilai index di luar batas");
        } else {
            Node11 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node11 newNode = new Node11(null, item, jarak, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node11 newNode = new Node11(current.prev, item, jarak, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void removeFirst() {
        if (isEmpty()) {
            // throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            // throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node11 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) {
        Node11 current = head;
        while (current != null) {
            if (current.data == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
        }
        size--;
    }

    public int getFirst()  {
        if (isEmpty()) {
            // throw new Exception("Linked List kosong");
        }
        return head.data;
    }

    public int getLast()  {
        if (isEmpty()) {
            // throw new Exception("Linked List kosong");
        }
        Node11 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get(int index)  {
        if (isEmpty() || index >= size) {
            // throw new Exception("Nilai indeks di luar batas.");
        }
        Node11 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int getJarak(int index)  {
        if (isEmpty() || index >= size) {
            // throw new Exception("Nilai indeks di luar batas.");
        }
        Node11 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}
