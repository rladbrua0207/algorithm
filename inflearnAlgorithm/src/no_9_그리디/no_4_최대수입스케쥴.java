package no_9_그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Lecture implements Comparable<Lecture> {
    int date;
    int money;
    public Lecture(int money, int date) {
        this.money = money;
        this.date = date;
    }
    @Override
    public int compareTo(Lecture o) {
        return o.date - this.date;
    }
}

public class no_4_최대수입스케쥴 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Lecture> arr = new ArrayList<>();

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int money = Integer.parseInt(st.nextToken());
            int date = Integer.parseInt(st.nextToken());
            arr.add(new Lecture(money, date));
        }

        Collections.sort(arr);

        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());//큰값에 우선순위
        int answer = 0;
        int maxDate = arr.get(0).date;
        int j = 0;
        for (int i = maxDate; i >= 1; i--) {
            for (; j < N; j++) {
                if (arr.get(j).date < i) break;
                pQ.offer(arr.get(j).money);
            }
            if(!pQ.isEmpty()) answer += pQ.poll();
        }
        System.out.println(answer);
    }
}
