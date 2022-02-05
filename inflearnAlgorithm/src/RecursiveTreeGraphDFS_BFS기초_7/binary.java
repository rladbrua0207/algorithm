package RecursiveTreeGraphDFS_BFS기초_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class binary {
    public void DFS(int n) {
        if(n == 0) return;
        System.out.print(n%2 + " ");
        DFS(n/2);
    }

    public static void main(String[] args) throws IOException {
        binary T = new binary();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        T.DFS(Integer.parseInt(st.nextToken()));
    }
}
