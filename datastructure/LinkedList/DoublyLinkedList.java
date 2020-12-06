package datastructure.LinkedList;

import java.security.InvalidParameterException;

public class DoublyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    // Constructor
    public DoublyLinkedList() {
        head = new Node();
        tail = new Node();

        head.next = tail;
        tail.prev = head;

        size = 0;
    }

    public void addFirst(int x) {
        Node n = new Node(x);
        n.next = head.next;
        head.next = n;
        n.next.prev = n;
        n.prev = head;
        size++;
    }

    public void addLast(int x) {
        Node n = new Node(x);
        n.prev = tail.prev;
        tail.prev = n;
        n.prev.next = n;
        n.next = tail;
        size++;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new InvalidParameterException("index out of range : " + index);
        }
        int i = 0;
        Node n = head;
        while (n.next != tail && i < index) {
            n = n.next;
            i++;
        }

        n.next = n.next.next;
        n.next.prev = n;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new InvalidParameterException("index out of range : " + index);
        }

        if (index < size/2) {
            int i = 0;
            Node n = head;
            while (n.next != null && i <= index) {
                n = n.next;
                i++;
            }
            return n.data;
        }

        int i = size;
        Node n = tail;
        while (i > index) {
            n = n.prev;
            i--;
        }
        return n.data;
    }

    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.addLast(10);
        dl.addLast(20);
        dl.addLast(30);
        dl.addLast(40);
        dl.addLast(50);
        dl.addLast(60);
        dl.addLast(70);
        dl.addLast(80);

        System.out.println(dl.get(4));
        dl.removeAt(4);
        System.out.println(dl.get(4));

        for (int i = 0; i < dl.size; i++) {
            System.out.println(dl.get(i));
        }
    }
}
