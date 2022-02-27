package winter2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q11724 {
    static ArrayList<ArrayList<Integer>> graph;
    static int[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) graph.add(new ArrayList<>());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        int answer = 0;
        check = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            if (check[i] == 0) {
                DFS(i);
                answer++;
            }
        }
        System.out.println(answer);
    }

    static void DFS(int root) {
        if (check[root] == 1) return;
        else {
            check[root] = 1;
            for (int i = 0; i < graph.get(root).size(); i++) {
                int vex = graph.get(root).get(i);
                if (check[vex] == 0) DFS(vex);
            }
        }
    }
}
