package datastructure.LinkedList;

public class Node {
    public int data;
    public Node next;
    public Node prev;

    // Constructor
    public Node() {
        data = 0;
        next = null;
        prev = null;
    }
    public Node(int x) {
        // Call first constructor
        this();
        data = x;
    }
}
