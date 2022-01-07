package StackAndQueue_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


class savePrincess {
    public int solution(int N, int K) {
        Queue<Integer> queue = new LinkedList();
        int count = 1;
        for(int i = 0; i < N; i++) queue.offer(i+1);

        while(queue.size() != 1){
            if(count % K == 0) queue.poll();
            else queue.offer(queue.poll());
            count++;
        }
        return queue.peek();
    }

    public static void main(String[] args) throws IOException {
        savePrincess T = new savePrincess();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(T.solution(N, K));
    }
}

