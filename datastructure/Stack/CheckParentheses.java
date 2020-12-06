package datastructure.Stack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckParentheses {
    public static boolean checkParentheses(String s) {
        StackString sk = new StackString();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '(' || c== '[') {
                sk.push("" + c);
            } else if (c == '}' || c == ')' || c== ']') {
                if (sk.size() == 0) return false;
                String p = sk.pop();
                char cp = p.charAt(0);
                if (c == '}' && cp != '{' || c == ')' && cp != '(' || c == ']' && cp != '[') {
                    return false;
                }
            }
        }
        if (sk.size() != 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        File file = new File("file/parentheses.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            System.out.println("Line : " + line);
            System.out.println("Complete : " + checkParentheses(line));

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
