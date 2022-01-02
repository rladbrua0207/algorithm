package stackQueue_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class removeParentheses {
    public String solution(String str){
        Stack<Character> stack=new Stack<>();
        String answer ="";
        for(char x : str.toCharArray()){
            if(x=='(') stack.push(x);
            else{
                if(x==')') stack.pop();
                else if(stack.isEmpty())answer += x;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        removeParentheses T = new removeParentheses();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}
