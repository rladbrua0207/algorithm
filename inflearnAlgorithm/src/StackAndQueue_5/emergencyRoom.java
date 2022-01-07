package StackAndQueue_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class emergencyRoom {
    public int solution(int N, int M, ArrayList arr) {
        int pos = M;
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();
        Q.addAll(arr);
        while(!Q.isEmpty()){
            int poll = Q.poll();
            if(poll >= Collections.max(Q)){
                answer++;
                if(pos == 0) return answer;
            }else{
                Q.offer(poll);
                if(pos == 0) pos = Q.size();
            }
            pos--;
        }
            return answer;
    }

    public static void main(String[] args) throws IOException {
        emergencyRoom T = new emergencyRoom();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        ArrayList<Integer> arr = new ArrayList();

        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }
        System.out.println(T.solution(N, M, arr));
    }
}
