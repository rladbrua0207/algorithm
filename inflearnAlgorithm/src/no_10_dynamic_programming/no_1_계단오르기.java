package no_10_dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_1_계단오르기 {
    static int[] dy;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dy = new int[N+1];
        dy[1] = 1;
        dy[2] = 2;
        for(int i = 3; i <= N; i++){
            dy[i] = dy[i-1] + dy[i-2];
        }
        System.out.println(dy[N]);
    }
}
