package stackQueue_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class correctParenthesis {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] arr = st.nextToken().toCharArray();
        Stack<Character> stack = new Stack();
        String answer = "YES";

        for(int i = 0; i < arr.length; i++){
            if (arr[i] == '(') stack.push(arr[i]);
            else if(!stack.isEmpty() && stack.peek() =='(') stack.pop();
            else{
                answer = "NO";
                break;
            }
        }
        if(!stack.isEmpty()) answer = "NO";
        System.out.println(answer);
    }
}
