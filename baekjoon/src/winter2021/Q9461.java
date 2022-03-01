package winter2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9461 {
    static long[] dp = new long[101];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            long answer = recursive(N);
            System.out.println(answer);
        }
    }

    static long recursive(int N) {
        if(dp[N] != 0) return dp[N];
        else if (N == 1 || N == 2 || N == 3) return dp[N] = 1;
        else return dp[N] = recursive(N - 3) + recursive(N - 2);
    }
}
