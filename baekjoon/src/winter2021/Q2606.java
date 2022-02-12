package winter2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q2606 {
    static ArrayList<ArrayList<Integer>> arr;
    static int[] check;
    static int answer = 0;

    static void DFS(int L) {
        if(check[1] == 0) return;
        else{
            for (int a : arr.get(L)) {
                if (check[a] == 0) {
                    check[a] = 1;
                    answer++;
                    DFS(a);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int P = Integer.parseInt(br.readLine());

        arr = new ArrayList<>();
        check = new int[N + 1];
        check[1] = 1;

        for (int i = 0; i <= N; i++) arr.add(new ArrayList<>());

        for (int i = 0; i < P; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr.get(a).add(b);
            arr.get(b).add(a);
        }
        DFS(1);
        System.out.println(answer);
    }
}
