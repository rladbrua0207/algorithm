package DFS_BFS활용_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최대점수구하기_3 {
    static int arr[][], answer = Integer.MIN_VALUE, N, M;

    static void DFS(int L, int score, int time){
        if(time > M) return;
        if(L == N)answer = Math.max(answer, score);
        else{
            DFS(L+1, score + arr[L][0], time + arr[L][1]);
            DFS(L+1, score , time );
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N+1][2];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            arr[i][0] = s;
            arr[i][1] = t;
        }

        DFS(0, 0, 0);
        System.out.println(answer);
    }
}
