package datastructure.LikedList;

public class LikedList {
    Node head;

    // Constructor
    public LikedList() {
        head = new Node();
    }

    public void addFirst(int x) {
        Node n = new Node();
        n.data = x;
        n.next = head.next;
        head.next = n;
    }

    public void addLast(int x) {
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        n.next = new Node();
        n.next.data = x;
    }

    public void insertAt(int x, int index) {
        int k = 0;
        Node n = head;
        while (n.next != null && k < index) {
            n = n.next;
            k++;
        }
        Node m = n.next;
        n.next = new Node();
        n.next.data = x;
        n.next.next = m;
    }

    public void removeAt(int index) {
        int k = 0;
        Node n = head;
        while (n != null && k < index) {
            n = n.next;
            k++;
        }
        if (n.next == null) return;
        n.next = n.next.next;
    }
}
