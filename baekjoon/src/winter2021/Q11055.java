package winter2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11055 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) arr[i] = Integer.parseInt(st.nextToken());

        int answer = arr[1];
        int[] dy = new int[N + 1];
        dy[1] = arr[1];
        for (int i = 2; i <= N; i++) {
            dy[i] = arr[i];
            int sum = 0;
            for (int j = 1; j <= i - 1; j++) {
                if (arr[i] > arr[j]) {
                    sum = Math.max(dy[j], sum);
                }
            }
            dy[i] = sum + dy[i];
            answer = Math.max(answer, dy[i]);
        }
        System.out.println(answer);
    }
}
