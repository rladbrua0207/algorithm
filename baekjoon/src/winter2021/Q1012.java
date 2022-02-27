package winter2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1012 {
    static int[][] board;
    static int[] dx = {1,-1,0,0}, dy={0,0,1,-1};
    static int M, N, K;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());//가로
            N = Integer.parseInt(st.nextToken());//세로
            K = Integer.parseInt(st.nextToken());//배추가 심어져 있는 위치 개수

            board = new int[M][N];
            for(int j = 0; j < K; j++){
                st = new StringTokenizer(br.readLine());
                int width = Integer.parseInt(st.nextToken());
                int high = Integer.parseInt(st.nextToken());
                board[width][high] = 1;
            }

            int answer = 0;
            for(int j = 0; j < M; j++){
                for(int k = 0; k < N; k++){
                    if(board[j][k] == 1){
                        DFS(j, k);
                        answer++;
                    }
                }
            }
            System.out.println(answer);
        }

    }
    static void DFS(int x, int y){
        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < M && ny >= 0 && ny < N && board[nx][ny] == 1){
                board[nx][ny] = 0;
                DFS(nx,ny);
            }
        }
    }
}
