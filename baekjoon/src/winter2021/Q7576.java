package winter2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Tomato {
    int row;
    int column;

    Tomato(int row, int column) {
        this.row = row;
        this.column = column;

    }
}

public class Q7576 {
    static int[][] arr, check;
    static int answer = 0;
    static Queue<Tomato> Q;

    static void BFS(int M, int N) {
        while (!Q.isEmpty()) {
            int len = Q.size();
            for(int i = 0 ; i < len; i++){
                Tomato t = Q.poll();
                int row = t.row;
                int column = t.column;
                int prevColumn = column - 1;
                int nextColumn = column + 1;
                int prevRow = row - 1;
                int nextRow = row + 1;

                if (prevColumn >= 0 && check[row][prevColumn] == 0) {
                    check[row][prevColumn] = check[row][column] + 1;
                    Q.offer(new Tomato(row,prevColumn));
                }
                if (nextColumn < M && check[row][nextColumn] == 0) {
                    check[row][nextColumn] = check[row][column] + 1;
                    Q.offer(new Tomato(row,nextColumn));
                }
                if (prevRow >= 0 && check[prevRow][column] == 0) {
                    check[prevRow][column] = check[row][column] + 1;
                    Q.offer(new Tomato(prevRow,column));
                }
                if (nextRow < N && check[nextRow][column] == 0) {
                    check[nextRow][column] = check[row][column] + 1;
                    Q.offer(new Tomato(nextRow,column));
                }

            }



        }
        for(int i = 0 ; i < N; i++){
            for(int j = 0; j < M; j++){
                if(check[i][j] == 0){
                    answer = -1;
                    return;
                }
                answer = Math.max(answer, check[i][j]);
            }
        }
        answer = answer - 1;


    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        final int M = Integer.parseInt(st.nextToken());
        final int N = Integer.parseInt(st.nextToken());

        arr = new int[N ][M ];
        check = new int[N ][M ];
        Q = new LinkedList();


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == -1) {
                    check[i][j] = -1;
                }
                if(arr[i][j] == 1){
                    Q.offer(new Tomato(i,j));
                    check[i][j] = 1;
                }
            }
        }
        BFS(M, N);

        System.out.println(answer);
    }
}
