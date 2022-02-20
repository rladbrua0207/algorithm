package no_7_RecursiveTreeGraphDFS_BFS기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class fibonacci {
    static int[] fibo;

    public int solution(int n) {
        if(fibo[n] > 0) return fibo[n];
        if(n == 0) return fibo[n] = 0;
        if (n == 1) return fibo[n] = 1;
        else if (n == 2) return fibo[n] = 1;
        else return fibo[n] = solution(n-2) + solution(n-1);


    }

    public static void main(String[] args) throws IOException {
        fibonacci T = new fibonacci();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        fibo = new int[n + 1];
        T.solution(n);
        System.out.println(fibo[n]);
    }
}
