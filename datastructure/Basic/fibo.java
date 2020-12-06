package datastructure.Basic;

public class fibo {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("The sequence of fibonacci of " + n + " numbers is : ");
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + "  ");
        }
        System.out.println();
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
