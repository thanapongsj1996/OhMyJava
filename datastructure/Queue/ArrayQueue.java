package datastructure.Queue;

import java.util.Arrays;

public class ArrayQueue {
    private int data[];
    private int head;
    private int tail;
    int size;

    public ArrayQueue() {
        data = new int[10];
        head = 0;
        tail = -1;
        size = 0;
    }

    public void enqueue(int value) {
        tail = (tail + 1) % data.length;
        data[tail] = value;
        size++;
    }

    public int dequeue() {
        int h = data[head];
        head = (head + 1) % data.length;
        return h;
    }

    public void printQueue() {
        System.out.println(Arrays.toString(data));
    }

    public int pop() {
        int t = data[tail];
        tail--;
        return t;
    }

    public int top() {
        int t = data[tail];
        return t;
    }
}
