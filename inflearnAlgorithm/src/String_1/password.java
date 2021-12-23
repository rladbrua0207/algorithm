package String_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class password {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String str = br.readLine();
        char[] ch = str.toCharArray();
        ArrayList<Integer> arr = new ArrayList<>();

        int answer = 0;
        for(int j = 0; j < ch.length; j++){
            if(ch[j] == '#'){
                answer += 1;
            }
            if(answer < 111111){
                answer *= 10;
            }else{
                arr.add(answer);
                answer = 0;
            }

        }
        for(int i = 0; i < arr.size(); i++){
            System.out.print((char)(int)Integer.valueOf(Integer.toString(arr.get(i)),2));
        }

    }
}
