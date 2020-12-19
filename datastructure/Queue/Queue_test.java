package datastructure.Queue;

public class Queue_test {
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<Integer>();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

        System.out.println(q.peek());
        System.out.println(q.dequeue());
    }
}
