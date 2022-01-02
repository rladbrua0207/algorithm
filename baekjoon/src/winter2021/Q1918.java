package winter2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q1918 {
    public String solution(String str){
        String answer="";
        Stack<Character> letter=new Stack<>();
        Stack<Character> operator = new Stack<>();
        for(char x : str.toCharArray()){
            if(Character.isLetter(x)){
                letter.push(x);
            }else{
                if(x == '('){

                }
            }

        }
        if(!stack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Q1918 T = new Q1918();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        System.out.println(T.solution(str));

    }
}
