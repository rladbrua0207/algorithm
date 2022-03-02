package winter2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1904 {
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dp = new int[N + 1];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < N; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 15746;
        }
        System.out.println(dp[N - 1]);
    }
/*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dp = new int[N + 1];
        int answer = recursive(N);
        System.out.println(answer);
    }
    static int recursive(int N) {
        if (dp[N] != 0) return dp[N];
        else if (N == 1) return dp[N] = 1;
        else if (N == 2) return dp[N] = 2;
        else return dp[N] = (recursive(N - 2) + recursive(N - 1))%15746;
    }
    */
}
