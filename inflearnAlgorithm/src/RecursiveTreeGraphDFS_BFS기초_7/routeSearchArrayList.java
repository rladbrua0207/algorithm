package RecursiveTreeGraphDFS_BFS기초_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class routeSearchArrayList {
    static int N;
    static int M;
    static int[] ch;
    static int count = 0;
    static ArrayList<ArrayList<Integer>> graph;

    public void DFS(int V) {
        if (V == N) {
            count++;
        } else {
            for (int nv : graph.get(V)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        routeSearchArrayList T = new routeSearchArrayList();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        ch = new int[N + 1];

         graph = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i <= N; i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
        }

        ch[1] = 1;
        T.DFS(1);

        System.out.println(count);
    }
}
