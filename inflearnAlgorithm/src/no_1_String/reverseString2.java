package no_1_String;

import java.util.ArrayList;
import java.util.Scanner;

public class reverseString2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for(int i = 0; i < n; i++){
            str[i]=kb.next();
        }
        ArrayList<String>  answer = new ArrayList<>();
        for(String x : str){
            //String tmp = new StringBuilder(x).reverse().toString();
            //answer.add(tmp);

            char[] s = x.toCharArray();
            int lt = 0, rt = x.length()-1;
            while(lt<rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        for(int i = 0; i < answer.size(); i++){
            System.out.println(answer.get(i));
        }
    }
}
