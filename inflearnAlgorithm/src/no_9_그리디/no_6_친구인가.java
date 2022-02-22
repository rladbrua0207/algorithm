package no_9_그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_6_친구인가 {
    static int[] unionFriend;

    public static int findParent(int a) {
        if (unionFriend[a] == a) return a;
        else return unionFriend[a] = findParent(unionFriend[a]);
    }
    public static void union(int a, int b) {
        a = findParent(a);
        b = findParent(b);
        if (a != b) unionFriend[b] = a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        unionFriend = new int[N+1];
        for (int i = 1 ; i <= N; i++) unionFriend[i] = i;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int friend1 = Integer.parseInt(st.nextToken());
            int friend2 = Integer.parseInt(st.nextToken());
            union(friend1, friend2);
        }
        st = new StringTokenizer(br.readLine());

        int friend1 = Integer.parseInt(st.nextToken());
        int friend2 = Integer.parseInt(st.nextToken());

        if (findParent(friend1) == findParent(friend2)) System.out.println("YES");
        else System.out.println("NO");
    }
}
