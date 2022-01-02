package stackQueue_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class postfix {
    public int solution(String str) {
        Stack<Integer> stack = new Stack();
        for (char ch : str.toCharArray()) {
            if ((int) ch >= 48 && (int) ch <= 57) stack.push((int) ch - 48);
            else if (ch == '+') stack.push(stack.pop() + stack.pop());
            else if (ch == '-') stack.push(-stack.pop() + stack.pop());
            else if (ch == '*') stack.push(stack.pop() * stack.pop());
            else if (ch == '/') stack.push(stack.pop() / stack.pop());
        }
        return stack.peek();
    }

    public static void main(String[] args) throws IOException {
        postfix T = new postfix();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        System.out.println(T.solution(str));
    }
}
