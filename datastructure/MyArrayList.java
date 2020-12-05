import java.security.InvalidParameterException;
import java.util.Arrays;

public class MyArrayList {
    private int[] data;
    private int size;

    // Constructor
    public MyArrayList() {
        size = 0;
        data = new int[10];
    }

    public void add(int x) {
        if (size >= data.length) {
            int []newData = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }

        data[size] = x;
        size++;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new InvalidParameterException("index out of range : " + index);
        }
        return data[index];
    }

    public void set(int x, int index) {
        if (index < 0 || index >= size) {
            throw new InvalidParameterException("index out of range : " + index);
        }
        data[index] = x;
    }

    public int[] toArray() {
        int[] x = new int[size];
        for (int i = 0; i < size; i++) {
            x[i] = data[i];
        }
        return x;
    }

    public String toString() {
        int[] x = toArray();
        return Arrays.toString(x);
    }
    
}
