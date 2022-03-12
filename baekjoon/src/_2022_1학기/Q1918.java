package _2022_1학기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q1918 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') sb.append(chars[i]);
            else if (chars[i] == '(') stack.push(chars[i]);
            else if (chars[i] == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty()) {//우선순위 설정
                    if (stack.peek() == '*' || stack.peek() == '/') sb.append(stack.pop());
                    else {
                        if (chars[i] != '*' && chars[i] != '/' && stack.peek() != '(') {
                            sb.append(stack.pop());
                        }else break;
                    }
                }
                stack.push(chars[i]);
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }
}
