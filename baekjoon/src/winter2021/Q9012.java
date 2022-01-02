package winter2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class Q9012 {
    public String solution(String str){
        String answer="YES";
        Stack<Character> stack=new Stack<>();
        for(char x : str.toCharArray()){
            if(x=='(') stack.push(x);
            else{
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if(!stack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Q9012 T = new Q9012();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String str;
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            str = st.nextToken();
            System.out.println(T.solution(str));
        }
    }
}