package winter2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pQ = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1) > Math.abs(o2)) return 1;
                else if(Math.abs(o1) == Math.abs(o2)) return  o1 - o2;
                else return -1;
                //절대값 (o1 > o2) o2가 앞으로 이동
                //절대값 (o1 == o2) 이면 더 작은값이 앞으로 이동
                //절대값 (o1 < o2) o1이 앞으로 이동
            }
        });

        for(int i = 0; i < N; i++){
            int x = Integer.parseInt(br.readLine());

            if(x == 0){
                if(!pQ.isEmpty()) System.out.println(pQ.poll());
                else System.out.println(0);
            }else{
                pQ.offer(x);
            }
        }
    }
}
