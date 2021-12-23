package String_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class shortCharacterDistance {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = st.nextToken();
        char ch = st.nextToken().charAt(0);
        char[] charr = str.toCharArray();
        ArrayList<Integer> index = new ArrayList<>();

        for(int i = 0; i < charr.length; i++){
            if(charr[i] == ch){
                index.add(i);
            }
        }
        for(int i = 0; i < charr.length; i++){
            int min = charr.length;
            for(int j = 0; j < index.size(); j++){
                if(Math.abs(i-index.get(j)) <= min ){
                    min = Math.abs(i-index.get(j));
                }
            }
            System.out.print(min + " ");
        }
    }
}
