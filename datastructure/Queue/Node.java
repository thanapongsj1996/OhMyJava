package datastructure.Queue;

public class Node<T> {
    public T data;
    public Node<T> next;
    public Node<T> prev;

    // Constructor
    public Node() {
        data = null;
        next = null;
        prev = null;
    }
    public Node(T x) {
        // Call first constructor
        this();
        data = x;
    }
}