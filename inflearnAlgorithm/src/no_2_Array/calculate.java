package no_2_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calculate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int extra = 0;
        int score = 0;
        String[] arr ;
        arr = br.readLine().split(" ");

        for (int i = 0; i < n; i ++){
            if(arr[i].equals("1")){
                extra ++;
                score+=extra;
            }else{
                extra = 0;
            }
        }

        System.out.print(score);
    }
}