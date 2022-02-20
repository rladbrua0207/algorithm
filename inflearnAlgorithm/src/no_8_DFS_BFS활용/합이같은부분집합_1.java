package no_8_DFS_BFS활용;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 합이같은부분집합_1 {
    static int[] arr, ch, sum;
    static int N, index = 0, total = 0;
    static String answer;
    public void DFS(int L){
        if(L == N){
            int sum = 0;
            for(int i = 0; i < N; i++){
                if(ch[i] == 1){
                    sum += arr[i];
                }
            }
            if(total - sum * 2 == 0){
                answer = "YES";
            }
            index++;
        }else{
            ch[L] = 1;
            DFS(L+1);
            ch[L] = 0;
            DFS(L+1);
        }
    }



    public static void main(String[] args) throws IOException {
        합이같은부분집합_1 T = new 합이같은부분집합_1();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        answer = "NO";

        st = new StringTokenizer(br.readLine());

        sum = new int[(int)Math.pow(2,N)];
        arr = new int[N];
        ch = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            total += arr[i];
        }

        T.DFS(0);

        System.out.println(answer);
    }
}