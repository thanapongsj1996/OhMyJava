package datastructure.Stack;

public class StackT<T> {
    private ArrayList<T> data;
    public StackT() {
        data = new ArrayList<T>();
    }

    public void push(T value) {
        data.add(value);
    }

    public T pop() {
        T t = data.get(data.size() - 1);
        data.removeAt(data.size() - 1);
        return t;
    }

    public T top() {
        T t = data.get(data.size() - 1);
        return t;
    }

    public int size() {
        return data.size();
    }
}
