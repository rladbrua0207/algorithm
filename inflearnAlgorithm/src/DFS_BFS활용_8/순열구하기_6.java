package DFS_BFS활용_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 순열구하기_6 {
    static void DFS(int L, int M, int[] arr, int[] answer){
        if(L == M){
            for (int a : answer) System.out.print(a + " ");
            System.out.println();
        }else{
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == 0) continue;
                answer[L] = arr[i];
                arr[i] = 0;
                DFS(L+1, M, arr, answer);
                arr[i] = answer[L];
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        int[] answer = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        DFS(0, M, arr, answer);
    }
}
