package Summer2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1806 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int s = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        int sum = 0;
        int lt = 0;
        int count = 1;
        int answer = 100000;

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        sum = arr[lt];
        for(int rt = 0; rt < n;){
            if(sum < s){
                if(rt == n-1){
                    break;
                }
                sum += arr[++rt];
                count++;
            }else if(sum > s){
                answer = Math.min(answer, count);
                sum -= arr[lt++];
                count--;
            }else{
                answer = Math.min(answer, count);
                if(rt == n-1){
                    break;
                }
                sum += arr[++rt] - arr[lt++];
            }
        }
        if(answer ==100000){
            System.out.println(0);
        }else{
            System.out.println(answer);
        }
    }
}
