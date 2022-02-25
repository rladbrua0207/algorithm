package winter2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Q1655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> lowPQ = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> highPQ = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (lowPQ.size() > highPQ.size())highPQ.offer(num);
            else lowPQ.offer(num);
            if (!lowPQ.isEmpty() && !highPQ.isEmpty() && lowPQ.peek() > highPQ.peek()) {
                highPQ.offer(lowPQ.poll());
                lowPQ.offer(highPQ.poll());
            }
            sb.append(lowPQ.peek() + "\n");
        }
        System.out.println(sb);
    }
}
