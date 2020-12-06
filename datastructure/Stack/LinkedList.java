package datastructure.Stack;

import java.security.InvalidParameterException;

public class LinkedList {
    public Node head;
    public int size;

    // Constructor
    public LinkedList() {
        head = new Node();
        size = 0;
    }

    public void addFirst(int x) {
        Node n = new Node();
        n.data = x;
        n.next = head.next;
        head.next = n;
        size++;
    }

    public void addLast(int x) {
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        n.next = new Node();
        n.next.data = x;
        size++;
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
        if (index < 0 || index >= size) {
            throw new InvalidParameterException("index out of range : " + index);
        }
        int i = 0;
        Node n = head;
        while (n.next != null && i < index) {
            n = n.next;
            i++;
        }
        n.next = n.next.next;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new InvalidParameterException("index out of range : " + index);
        }
        int i = 0;
        Node n = head;
        while (n.next != null && i <= index) {
            n = n.next;
            i++;
        }
        return n.data;
    }
}
