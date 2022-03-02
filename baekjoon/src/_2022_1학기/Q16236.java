package _2022_1학기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class BabyShark {
    int x;
    int y;
    int size;
    int exp;
    int time;

    public BabyShark(int x, int y, int size, int exp, int time) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.exp = exp;
        this.time = time;
    }
}

public class Q16236 {//아직못풂
    static int N, answer = 0;
    static int[] dx = {-1, 0, 1, 0}, dy = {0, -1, 0, 1};
    static int[][] board, visited;
    static Queue<BabyShark> Q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        board = new int[N][N];
        BabyShark baby = null;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int location = Integer.parseInt(st.nextToken());
                board[i][j] = location;
                if (location == 9) {
                    baby = new BabyShark(i, j, 2, 0, 0);
                }
            }
        }
        Q = new LinkedList<>();
        BFS(baby);
        System.out.println(answer);
    }

    static void BFS(BabyShark baby) {

        while (true) {

            Q.offer(baby);
            while (!Q.isEmpty()) {
                BabyShark cBaby = Q.poll();
                answer = Math.max(cBaby.time, answer);
                for (int j = 0; j < 4; j++) {
                    int nx = cBaby.x + dx[j];
                    int ny = cBaby.y + dy[j];
                    int size = cBaby.size;
                    int exp = cBaby.exp;
                    int time = cBaby.time;
                    if (nx >= 0 && nx < N && ny >= 0 && ny < N && size >= board[nx][ny]) {
                        if (size == board[nx][ny]) {
                            Q.offer(new BabyShark(nx, ny, size, exp, time + 1));
                        } else {//nSize > board[nx][ny]
                            exp += 1;
                            if (exp == size) {
                                size += 1;
                                exp = 0;
                            }
                            Q.offer(new BabyShark(nx, ny, size, exp, time + 1));
                        }
                        board[nx][ny] = 0;
                    }
                }
            }
        }
    }
}
