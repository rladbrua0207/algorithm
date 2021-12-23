package SliidingWindow_TwoPorinter_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class continueNatureNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n+1];
        for(int i = 1; i <= n; i++){
            arr[i] = i;
        }

        int sum = 1;
        int lt = 1;
        int rt = 1;
        int count = 0;

        while (true){
            if(arr[lt] > n/2){
                break;
            }
            if(sum < n){
                sum += arr[++rt];
            }else if(sum > n){
                sum -= arr[lt++];
            }else{
                sum += arr[++rt] - arr[lt++];
                count++;
            }
        }
        System.out.println(count);
    }
}
