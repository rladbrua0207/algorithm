package winter2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1976 {
    static int[] city;

    public static int findParent(int a) {
        if (city[a] == a) return a;
        else return city[a] = findParent(city[a]);
    }

    public static void union(int a, int b) {
        a = findParent(a);
        b = findParent(b);
        if (a != b) city[b] = a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        city = new int[N + 1];
        for (int i = 1; i <= N; i++) city[i] = i;

        StringTokenizer st;
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) if (Integer.parseInt(st.nextToken()) == 1) union(city[i], city[j]);
            //i와 연결돼 있는 j도시 이므로 union(city[i], city[j])
        }

        String answer = "YES";

        st = new StringTokenizer(br.readLine());
        int pCity = findParent(Integer.parseInt(st.nextToken()));
        for (int i = 1; i < M; i++) {
            int cCity = findParent(Integer.parseInt(st.nextToken()));
            if (pCity != cCity) {
                answer = "NO";
                break;
            }
            pCity = cCity;
        }
        System.out.println(answer);
    }
}
