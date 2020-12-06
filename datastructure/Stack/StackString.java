package datastructure.Stack;

public class StackString {
    LinkedListString ls;

    public StackString() {
        ls = new LinkedListString();
    }

    public void push(String s) {
        ls.addFirst(s);
    }

    public String pop() {
        String s  = ls.get(0);
        ls.removeAt(0);
        return s;
    }

    public String top() {
        String s  = ls.get(0);
        return s;
    }

    public int size() {
        return ls.size();
    }

    public void StackStringData() {
        for (int i = 0; i < ls.size(); i++) {
            System.out.print(ls.get(i) + "\t");
        }
    }
}
