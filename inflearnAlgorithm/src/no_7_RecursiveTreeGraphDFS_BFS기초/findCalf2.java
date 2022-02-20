package no_7_RecursiveTreeGraphDFS_BFS기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {

    public int BFS(int S, int E) {
        int L = 0;
        int check[] = new int[10001];
        int[] pos = {5, 1, -1};
        Queue<Integer> Q = new LinkedList<>();

        Q.offer(S);
        while (!Q.isEmpty()) {
            int size = Q.size();
            for (int i = 0; i < size; i++) {
                int a = Q.poll();
                if (a == E) return L;

                for (int j = 0; j < pos.length; j++) {
                    int b = a + pos[j];
                    if (b >= 1 && b <= 10000 && check[b] ==0) {
                        check[b] = 1;
                        Q.offer(b);
                    }
                }
            }
            L++;
        }

        return L;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        System.out.print(T.BFS(S, E));
    }
}
