package SliidingWindowAndTwoPorinter_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class sumArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr1[i] = Integer.parseInt(st1.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] arr2 = new int[m+n];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++){
            arr2[i] = Integer.parseInt(st2.nextToken());
        }

        System.arraycopy(arr1, 0, arr2, m, n);

        Arrays.sort(arr2);
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
