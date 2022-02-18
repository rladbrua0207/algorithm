package winter2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class ConferenceTime implements Comparable<ConferenceTime> {
    public int start, end;

    ConferenceTime(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(ConferenceTime o) {
        if (this.end == o.end) return this.start - o.start;
        else return this.end - o.end;
    }
}

public class Q1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        ConferenceTime[] time = new ConferenceTime[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            time[i] = new ConferenceTime(start, end);
        }
        Arrays.sort(time);

        System.out.println(solution(time));
    }

    static int solution(ConferenceTime[] time) {
        int count = 0;
        int endTime = 0;
        for (ConferenceTime t : time) {
            if (t.start >= endTime) {
                count++;
                endTime = t.end;
            }
        }
        return count;
    }
}
