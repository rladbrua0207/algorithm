package _2022_1학기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q16194 {
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        dp = new int[N+1];
        int[] cost = new int[N+1];
        for (int i = 1; i <= N; i++) {
            cost[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.fill(dp,1);

        for (int i = 1; i <= N; i++) {
            dp[i] = cost[i];
            for (int j = 1; j <= i ; j++) {
                dp[i] = Math.min(dp[i], dp[i-j] + cost[j]);
            }
        }
        System.out.println(dp[N]);
    }
}