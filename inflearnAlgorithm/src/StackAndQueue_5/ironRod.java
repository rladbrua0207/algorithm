package StackAndQueue_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class ironRod {
    public int solution(String str){
        Stack<Character> stack = new Stack<>();
        int answer=0;
        char pre= '(';
        for(char ch : str.toCharArray()){
            if(ch == '('){
                stack.push(ch);
            }else{
                if(pre == '('){
                    stack.pop();
                    answer += stack.size();
                }else {//')'
                    answer += 1;
                    stack.pop();
                }
            }
            pre = ch;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        ironRod T = new ironRod();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}
