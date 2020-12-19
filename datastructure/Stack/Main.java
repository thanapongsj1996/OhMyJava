package datastructure.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stk = new Stack();
        for (int i = 0; i < 10; i++) {
            stk.push(i);
        }

        System.out.println(stk.top());
        stk.pop();
        stk.pop();
        System.out.println(stk.top());

        StackT<Integer> skt = new StackT<Integer>();
        skt.push(5);
        skt.push(6);
        skt.push(7);
        skt.push(8);

        System.out.println(skt.top());
        skt.pop();
        System.out.println(skt.top());
    }
}
