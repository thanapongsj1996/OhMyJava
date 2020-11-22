package Basic;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        System.out.println("------ Start ------");

        int n = 50000;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }

        long x1, x2;

        // System.out.println("Random numbers : " + Arrays.toString(arr));
        x1 = System.currentTimeMillis();
        bubbleSort(arr);
        x2 = System.currentTimeMillis();
        // System.out.println("Bubble Sort O(n^2) : " + Arrays.toString(arr));
        System.out.println("Bubble Sort O(n^2) takes time : " + (x2 - x1) + " milliseconds");

        System.out.println("--------------------------");

        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }

        // System.out.println("Random numbers : " + Arrays.toString(arr));
        x1 = System.currentTimeMillis();
        selectionSort(arr);
        x2 = System.currentTimeMillis();
        // System.out.println("Selection Sort O(n^2) : " + Arrays.toString(arr));
        System.out.println("Selection Sort O(n^2) takes time : " + (x2 - x1) + " milliseconds");

        System.out.println("--------------------------");

        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }

        // System.out.println("Random numbers : " + Arrays.toString(arr));
        x1 = System.currentTimeMillis();
        insertionSort(arr);
        x2 = System.currentTimeMillis();
        // System.out.println("Insertion Sort O(n^2) : " + Arrays.toString(arr));
        System.out.println("Insertion Sort O(n^2) takes time : " + (x2 - x1) + " milliseconds");
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int maxIndex = 0;
            int max = Integer.MIN_VALUE;
            int lastIndex = arr.length - i - 1;

            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > max) {
                    maxIndex = j;
                    max = arr[j];
                }
            }

            int temp = arr[maxIndex];
            arr[maxIndex] = arr[lastIndex];
            arr[lastIndex] = temp;
        }

        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = i-1; j >= 0; j--) {
                if (temp > arr[j]) {
                    arr[j+1] = temp;
                    break;
                }
                arr[j+1] = arr[j];
            }   
        }

        return arr;
    }
}

