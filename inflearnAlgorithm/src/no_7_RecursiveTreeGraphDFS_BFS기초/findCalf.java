package no_7_RecursiveTreeGraphDFS_BFS기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


class findCalf {
    int[] dis = {1, -1, 5};
    int[] ch;
    Queue<Integer> Q = new LinkedList<>();

    public int BFS(int S, int E) {
        ch = new int[10001];
        ch[S] = 1;
        Q.offer(S);
        int L = 0; //level
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int x = Q.poll();
                if(x == E) return L;
                for(int j = 0; j < 3; j++){
                    int nx = x + dis[j];
                    if(nx >= 1 && nx <= 10000 && ch[nx] ==0){
                        Q.offer(nx);
                        ch[nx] = 1;
                    }
                }
            }
            L++;
        }
        return L;
    }

    public static void main(String[] args) throws IOException {
        findCalf T = new findCalf();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        System.out.println(T.BFS(S, E));
    }
}