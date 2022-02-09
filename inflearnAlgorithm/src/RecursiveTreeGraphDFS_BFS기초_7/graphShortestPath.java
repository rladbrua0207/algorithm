package RecursiveTreeGraphDFS_BFS기초_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class graphShortestPath {
    static int N;
    static int M;
    static int[] ch;
    static int[] dis;
    static ArrayList<ArrayList<Integer>> graph;
    static int count = 0;
    static Queue<Integer> Q;

    public void BFS(int root) {
        int L = 0;
        Q.offer(root);
        while (!Q.isEmpty()){
            int len = Q.size();
            for(int i = 0; i < len; i++){
                int vt = Q.poll();
                for(int nv : graph.get(vt)){
                    if(ch[nv] == 0){
                        Q.offer(nv);
                        ch[nv] = L+1;
                    }
                }
            }
            L++;
        }



    }

    public static void main(String[] args) throws IOException {
        graphShortestPath T = new graphShortestPath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        ch = new int[N + 1];
        dis = new int[N + 1];
        Q = new LinkedList<>();

        graph = new ArrayList<>();
        for(int i = 0; i <= N; i++){
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
        }
        T.BFS(1);

        for(int i = 2; i < ch.length; i++){
        System.out.println(ch[i]);

        }
    }
}
