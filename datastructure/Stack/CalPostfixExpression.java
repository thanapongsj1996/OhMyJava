package datastructure.Stack;

public class CalPostfixExpression {
    public static int evaluate(String[] s) {
        StackString sk = new StackString();

        for (int i = 0; i < s.length; i++) {
            String k = s[i];
            if (k.equals("+") || k.equals("-") || k.equals("*") || k.equals("/")) {
                int a = Integer.parseInt(sk.pop());
                int b = Integer.parseInt(sk.pop());

                System.out.print("a = " + a + " ,b = " + b + "\t:\t");

                if (k.equals("+")) {
                    sk.push(String.valueOf(a + b));
                    System.out.print(a + " + " + b + " = " + (a+b));
                } else if (k.equals("-")) {
                    sk.push(String.valueOf(a - b));
                    System.out.print(a + " - " + b + " = " + (a-b));
                } else if (k.equals("*")) {
                    sk.push(String.valueOf(a * b));
                    System.out.print(a + " * " + b + " = " + (a*b));
                } else if (k.equals("/")) {
                    sk.push(String.valueOf(a / b));
                    System.out.print(a + " / " + b + " = " + (a/b));
                }
                System.out.println();
            } else {
                sk.push(k);
            }
        }
        
        return Integer.parseInt(sk.pop());
    }

    public static void main(String[] args) {
        String[] infix = new String[]{"2", "9", "+", "7", "*", "5", "+", "3", "+", "5", "2", "/", "+"};
        int value = evaluate(infix);
        System.out.println("Value of 2 9 + 7 * 5 + 3 + 5 2 / + after calculate is : " + value);
    }
}
