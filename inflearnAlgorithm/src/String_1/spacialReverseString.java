package String_1;

import java.io.*;

public class spacialReverseString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char[] ch = str.toCharArray();
        int lt = 0, rt= ch.length-1;

        while(lt < rt){
            /**if(ch[lt] < 'A'|| ch[lt] >'z' || ch[lt]<'a' && ch[lt]>'Z'){
                lt++;
            }else if(ch[rt] < 'A'|| ch[rt] >'z' || ch[rt]<'a' && ch[rt]>'Z'){
                rt--;
            }else{
                char tmp = ch[lt];
                ch[lt] = ch[rt];
                ch[rt] = tmp;
                lt++;
                rt--;
            }**/
            if(!Character.isAlphabetic(ch[lt])){
                lt++;
            }else if(!Character.isAlphabetic(ch[rt])){
                rt--;
            }else{
                char tmp = ch[lt];
                ch[lt] = ch[rt];
                ch[rt] = tmp;
                lt++;
                rt--;
            }
        }
        System.out.println(ch);
    }
}
