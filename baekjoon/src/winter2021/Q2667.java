package winter2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Q2667 {
    static int[][] graph;
    static int[] dx = {1, -1, 0, 0}, dy = {0, 0, 1, -1};
    static int N, count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        graph = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            String str = br.readLine();
            for (int j = 1; j <= N; j++) {
                graph[i][j] = str.charAt(j-1) - '0';
            }
        }

        ArrayList<Integer> countArr = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (graph[i][j] == 1) {
                    graph[i][j] = 0;
                    count = 1;
                    DFS(i, j);
                    countArr.add(count);
                }
            }
        }
        Collections.sort(countArr);

        System.out.println(countArr.size());
        for (int i : countArr) {
            System.out.println(i);
        }
    }

    static void DFS(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 1 && nx <= N && ny >= 1 && ny <= N && graph[nx][ny] == 1) {
                graph[nx][ny] = 0;
                count++;
                DFS(nx, ny);
            }
        }
    }
}
