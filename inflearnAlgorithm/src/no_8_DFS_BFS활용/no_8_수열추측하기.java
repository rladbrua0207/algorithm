package no_8_DFS_BFS활용;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_8_수열추측하기 {
    static int N, F;
    static boolean flag = false;
    static int[] arr, check, answer;
    static int[][] dy = new int[35][35];

    static int combi(int n, int r) {
        if(dy[n][r] > 0)  return dy[n][r];
        if(n == r || r == 0) return 1;
        else return dy[n][r] = combi(n-1, r-1) + combi(n-1, r);
    }

    static void DFS(int L, int sum) {
        if (flag == true) return;
        if (L == N) {
            if (sum == F) {
                flag = true;
                for (int i = 0; i < N; i++)
                    System.out.print(answer[i] + " ");
            }

            return;
        } else {
            for (int i = 1; i <= N; i++) {
                if (check[i] == 0) {
                    check[i] = i;
                    answer[L] = check[i];
                    DFS(L + 1, sum + arr[L] * answer[L]);
                    check[i] = 0;
                    answer[L] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        F = Integer.parseInt(st.nextToken());
        arr = new int[N];
        check = new int[N + 1];
        answer = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = combi(N - 1, i);
        }

        DFS(0, 0);
    }
}
