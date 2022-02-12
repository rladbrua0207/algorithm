package DFS_BFS활용_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 동전교환_5 {
    static int[] check;
    static ArrayList<Integer> kinds;
    static int M, answer = Integer.MAX_VALUE;

    public static void DFS(int L, int sum) {
        if (sum > M) return;
        if(L>= answer) return;
        if (sum == M) {
            answer = Math.min(answer, L);
            return;
        } else {
            for (int i = 0; i < kinds.size(); i++) {
                if(check[sum+ kinds.get(i)] == 0){
                    DFS(L + 1, sum + kinds.get(i));
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        kinds = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            kinds.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(kinds);
        Collections.reverse(kinds);
        check = new int[N * 100];

        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());

        DFS(0, 0);
        System.out.println(answer);
    }
}
