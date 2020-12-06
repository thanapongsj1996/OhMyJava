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
    }
}
