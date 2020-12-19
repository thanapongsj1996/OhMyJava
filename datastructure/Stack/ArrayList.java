package datastructure.Stack;

import java.security.InvalidParameterException;

public class ArrayList<T> {
    private T [] data;
    private int size;
    public ArrayList() {
        size = 0;
        data = (T[])(new Object[10]);
    }

    public void add(T value) {
        if (size >= data.length) {
            T[] newData = (T[])(new Object[data.length * 2]);
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }

        data[size] = value;
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new InvalidParameterException("index out of range : " + index);
        }
        return data[index];
    }

    public void set(T value, int index) {
        if (index < 0 || index >= size) {
            throw new InvalidParameterException("index out of range : " + index);
        }
        data[index] = value;
    }

    public int size() {
        return size;
    }

    public void removeAt(int index) {
        for (int i = index; i < size; i++) {
            data[i] = data[i+1];
        }
        size--;
    }
}