package String_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        str = str.toLowerCase();
        char[] ch = str.toCharArray();

        int lt = 0;
        int rt = ch.length-1;

        while(lt < rt){
            if(ch[lt] != ch[rt]){
                System.out.print("NO");
                System.exit(0);
            }else{
                lt++;
                rt--;
            }
        }
        System.out.print("YES");
    }
}

