package winter2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11054 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N + 1];
        for (int i = 1; i <= N; i++) arr[i] = Integer.parseInt(st.nextToken());

        int answer = 1;
        int[] dy = new int[N + 1];
        dy[1] = 1;
        for (int k = 2; k <= N - 1; k++) {
            for (int i = 2; i <= N; i++) {
                dy[i] = 1;
                for (int j = 1; j <= i - 1; j++) {
                    int max = Math.max(dy[j] + 1, dy[i]);
                    if (i >= k) {
                        if (arr[i] < arr[j]) dy[i] = max;
                    } else {
                        if (arr[i] > arr[j]) dy[i] = max;
                    }
                }
                answer = Math.max(answer, dy[i]);
            }
        }
        System.out.println(answer);
    }
}
