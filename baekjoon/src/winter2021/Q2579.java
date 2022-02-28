package winter2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] score = new int[N + 1];
        int[] dp = new int[N + 1];
        boolean[] step = new boolean[N + 1];
        Arrays.fill(step, false);

        for (int i = 1; i <= N; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = score[1];
        for (int i = 2; i <= N; i++) {
        }

        System.out.println(score[N]);


    }
}
