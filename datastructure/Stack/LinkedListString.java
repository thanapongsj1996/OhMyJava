package datastructure.Stack;

public class LinkedListString {
    private SNode head;
    private int size;

    // Constructor
    public LinkedListString() {
        head = new SNode();
        size = 0;
    }

    public void addFirst(String s) {
        SNode n = new SNode();
        n.data = s;
        n.next = head.next;
        head.next = n;
        size++;
    }

    public void addLast(String s) {
        SNode n = head;
        while (n.next != null) {
            n = n.next;
        }

        n.next = new SNode();
        n.next.data = s;
        size++;
    }

    public void insertAt(String s, int index) {
        int k = 0;
        SNode n = head;
        while (n.next != null && k < index) {
            n = n.next;
            k++;
        }

        SNode m = n.next;
        n.next = new SNode();
        n.next.data = s;
        n.next.next = m;
        size++;
    }

    public void removeAt(int index) {
        int k = 0;
        SNode n = head;
        while (n.next != null && k < index) {
            n = n.next;
            k++;
        }
        if (n.next == null) {
            return;
        }

        n.next = n.next.next;
        size--;
    }

    public String get(int index) {
        int k = 0;
        SNode n = head;
        while (k <= index && n != null) {
            n = n.next;
            k++;
        }
        return n.data;
    }

    public int size() {
        return size;
    }


}
