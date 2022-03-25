package _2022_1학기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Subin {
    int location;
    int count;

    Subin(int location, int count) {
        this.location = location;
        this.count = count;
    }
}

public class Q1697 {
    static int K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());


        int answer = BFS(N);
    }

    static int BFS(int root) {
        Queue<Subin> Q = new LinkedList<>();
        Q.offer(new Subin(root, 0));
        while (!Q.isEmpty()) {
            Subin s = Q.poll();

            if (s.location == K) {

            } else if (s.location < K / 2) {
                Q.offer(new Subin(s.location * 2, s.count + 1));
            } else if (s.location < K) {
                Q.offer(new Subin(s.location + 1, s.count + 1));
            } else {
                Q.offer(new Subin(s.location + -1, s.count + 1));
            }

        }
    }


}
