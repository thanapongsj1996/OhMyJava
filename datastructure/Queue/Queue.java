package datastructure.Queue;

public class Queue<T> {
    DoublyLinkedList<T> list;

    public Queue() {
        list = new DoublyLinkedList<T>();
    }

    public void enqueue(T value) {
        list.addFirst(value);
    }

    public T dequeue() {
        T t = list.get(list.size - 1);
        list.removeAt(list.size - 1);
        return t;
    }

    public T peek() {
        T t = list.get(list.size - 1);
        return t;
    }

    public int size() {
        return list.size;
    }
    
}
