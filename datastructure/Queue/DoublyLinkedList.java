package datastructure.Queue;

import java.security.InvalidParameterException;

public class DoublyLinkedList<T> {
    public Node<T> head;
    public Node<T> tail;
    public int size;

    // Constructor
    public DoublyLinkedList() {
        head = new Node<T>();
        tail = new Node<T>();

        head.next = tail;
        tail.prev = head;

        size = 0;
    }

    public void addFirst(T x) {
        Node<T> n = new Node<T>(x);
        n.next = head.next;
        head.next = n;
        n.next.prev = n;
        n.prev = head;
        size++;
    }

    public void addLast(T x) {
        Node<T> n = new Node<T>(x);
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
        Node<T> n = head;
        while (n.next != tail && i < index) {
            n = n.next;
            i++;
        }

        n.next = n.next.next;
        n.next.prev = n;
        size--;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new InvalidParameterException("index out of range : " + index);
        }

        if (index < size/2) {
            int i = 0;
            Node<T> n = head;
            while (n.next != null && i <= index) {
                n = n.next;
                i++;
            }
            return n.data;
        }

        int i = size;
        Node<T> n = tail;
        while (i > index) {
            n = n.prev;
            i--;
        }
        return n.data;
    }

    public int getSize() {
        return size;
    }
}
