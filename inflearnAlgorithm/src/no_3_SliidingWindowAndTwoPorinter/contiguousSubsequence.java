package no_3_SliidingWindowAndTwoPorinter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class contiguousSubsequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());

        int[] arr = new int[n];
        int count = 0;

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        int sum = 0;
        int prevIndex = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(sum == m){
                count++;
            }
            while(sum >= m){
                sum -= arr[prevIndex++];
                if(sum == m){
                    count++;
                }
            }

//            if(sum < m){
//                sum += arr[i];
//            }if(sum > m) {
//                sum -= arr[prevIndex];
//                prevIndex++;
//                i--;
//            }
//            if(sum == m){
//                count ++;
//                if( i != n-1) {
//                    sum += arr[i + 1] - arr[prevIndex];
//                    prevIndex++;
//                }
//            }
        }
        System.out.println(count);
    }
}
