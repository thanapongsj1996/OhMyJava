package Basic;

public class subsequence {
    public static void main(String[] args) {
        System.out.println("----- Start ------");
        System.out.println();

        int n = 1000;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * n - n/2);
        }

        long x1, x2;
        x1 = System.currentTimeMillis();
        int result1 = mss1(arr);
        x2 = System.currentTimeMillis();
        System.out.println("Maximun Subsequence Sum : " + result1 + " , BigO = O(n^3) takes time = " + (x2 - x1) + " milliseconds");
        
        x1 = System.currentTimeMillis();
        int result2 = mss2(arr);
        x2 = System.currentTimeMillis();
        System.out.println("Maximun Subsequence Sum : " + result2 + " , BigO = O(n^2) takes time = " + (x2 - x1) + " milliseconds");

        x1 = System.currentTimeMillis();
        int result3 = mss3(arr);
        x2 = System.currentTimeMillis();
        System.out.println("Maximun Subsequence Sum : " + result3 + " , BigO = O(n) takes time = " + (x2 - x1) + " milliseconds");

        x1 = System.currentTimeMillis();
        int result4 = mss_boy(arr);
        x2 = System.currentTimeMillis();
        System.out.println("Maximun Subsequence Sum : " + result4 + " , BigO = O(n) takes time = " + (x2 - x1) + " milliseconds");
    }

    public static int mss1(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println("Mss1");
        return max;
    }

    public static int mss2(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println("Mss2");
        return max;
    }

    public static int mss3(int[] arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum < 0) {
                sum = 0;
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println("Mss3");
        return max;
    }

    public static int mss_boy(int[] arr) {
        int max = 0;
        int sum = 0;
        int l = 0;
        int r = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        while (l < r) {
            if (arr[l] > arr[r]) {
                sum -= arr[r];
                r -= 1;
            } else {
                sum -= arr[l];
                l += 1;
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println("Mss_boy");
        return max;
    }
}
