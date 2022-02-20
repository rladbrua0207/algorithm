package no_9_그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Friends implements Comparable<Friends>{
    int start;
    int end;
    public Friends(int start, int end){
        this.start = start;
        this.end = end;
    }
    @Override
    public int compareTo(Friends o) {
        if(this.start == o.start) return this.end - o.end;
        else return this.start - o.start;
    }
}

public class no_3_결혼식 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        Friends[] time = new Friends[N];

        for(int i = 0 ; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            time[i] = new Friends(start, end - 1);//끝나는 시간 정각에는 피료연 장에 존재하지 않으므로 - 1
        }
        Arrays.sort(time);

        int answer = 0;

        for(int i = time[0].start; i <= time[N-1].end; i++){
            int count = 0;
            for(int j = 0; j < N; j++){
                if(i >= time[j].start && i <=time[j].end) count++;
            }
            answer = Math.max(answer, count);
        }

        System.out.println(answer);
    }
}
