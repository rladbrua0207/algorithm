package String_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class removeOverlapString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
//        ArrayList<Character> arr = new ArrayList<Character>();
//
//        for(int i = 0; i < str.length(); i++){
//            arr.add(str.charAt(i));
//        }
//        for(int i = 0; i < arr.size(); i++){
//            for(int j = i+1; j < arr.size(); j++){
//                if(arr.get(i) == arr.get(j)){
//                    arr.remove(j);
//                    j--;
//                }
//            }
//        }
//
//        for(int i = 0; i < arr.size(); i++){
//            System.out.print(arr.get(i));
//        }

        String answer="";
        for(int i = 0; i < str.length(); i++){
            if(str.indexOf(str.charAt(i))==i) answer += str.charAt(i);
        }
        System.out.println(answer);
    }
}
