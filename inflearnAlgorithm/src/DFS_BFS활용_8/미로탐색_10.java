package DFS_BFS활용_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 미로탐색_10 {
    static int[] dx = {1, -1, 0, 0}, dy = {0, 0, 1, -1};
    static int count = 0;
    static int[][] maze;

    static void DFS(int x, int y) {
        if (x == 7 && y == 7) {
            count++;
        } else {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx <= 7 && nx >= 1 && ny <= 7 && ny >= 1 && maze[nx][ny] == 0) {
                    maze[nx][ny] = 1;
                    DFS(nx, ny);
                    maze[nx][ny] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        maze = new int[8][8];

        for (int i = 1; i < maze.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < maze.length; j++) {
                maze[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        maze[1][1] = 1;
        DFS(1, 1);

        System.out.println(count);
    }
}
