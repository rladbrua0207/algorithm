package winter2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M, checkDFS[], checkBFS[];
    static ArrayList<ArrayList<Integer>> graph;
    static ArrayList<Integer> answerDFS, answerBFS;

    public static void DFS(int V, int count) {
        if (count == N) {
            return;
        } else {
            for (int vt : graph.get(V)) {
                if(checkDFS[vt] == 0){
                    checkDFS[vt] = 1;
                    answerDFS.add(vt);
                    DFS(vt, count + 1);
                }
            }
        }
    }

    public static void BFS(int V) {
        Queue<Integer> Q = new LinkedList();
        Q.offer(V);
        while(!Q.isEmpty()){
            int cv = Q.poll();
            for(int nv : graph.get(cv)){
                if(checkBFS[nv] == 0){
                    answerBFS.add(nv);
                    Q.offer(nv);
                    checkBFS[nv] = 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();
        answerDFS = new ArrayList();
        answerBFS = new ArrayList();
        checkDFS = new int[N + 1];
        checkBFS = new int[N + 1];

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for(int i = 1; i <= N; i++){
            Collections.sort(graph.get(i));
        }

        answerDFS.add(V);
        answerBFS.add(V);
        checkDFS[V] = 1;
        checkBFS[V] = 1;
        DFS(V, 1);
        BFS(V);

        for(int answer : answerDFS){
            System.out.print(answer + " ");
        }

        System.out.println();

        for(int answer : answerBFS){
            System.out.print(answer + " ");
        }
    }
}
