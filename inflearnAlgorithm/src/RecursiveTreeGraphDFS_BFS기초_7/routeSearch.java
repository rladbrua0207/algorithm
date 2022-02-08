package RecursiveTreeGraphDFS_BFS기초_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class routeSearch {
    static int N;
    static int M;
    static int[] ch;
    static int[][] graph;
    static int count = 0;

    public void DFS(int V) {
        ch[V] = 1;
        if (V == N) {
            count++;
        } else {
            for (int i = 1; i <= N; i++) {
                if (graph[V][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;
                }

            }
        }
    }

    public static void main(String[] args) throws IOException {
        routeSearch T = new routeSearch();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        ch = new int[N + 1];
        graph = new int[N + 1][N + 1];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            int row = Integer.parseInt(st.nextToken());
            int column = Integer.parseInt(st.nextToken());
            graph[row][column] = 1;
        }
        T.DFS(1);

        System.out.println(count);
    }
}
