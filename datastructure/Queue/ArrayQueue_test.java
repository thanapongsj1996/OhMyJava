package datastructure.Queue;

public class ArrayQueue_test {
    public static void main(String[] args) {
        ArrayQueue arr = new ArrayQueue();
    
        for (int i = 0; i < 10; i++) {
            arr.enqueue((int)(Math.random() * 100));
        }

        arr.printQueue();
        System.out.println("top : " + arr.top());

        arr.pop();
        System.out.println("top : " + arr.top());

        System.out.println("first: " + arr.dequeue());
        System.out.println("first: " + arr.dequeue());
    }
}
