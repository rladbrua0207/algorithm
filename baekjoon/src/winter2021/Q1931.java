package winter2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class ConferenceTime{
    int start;
    int end;
    ConferenceTime(int start, int end){
        this.start = start;
        this.end = end;
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

        sortTimeEnd(time);
        sortTimeStart(time);

        System.out.println(solution(time));

    }

    static void sortTimeEnd(ConferenceTime[] time){
        for(int i=0; i < time.length; i++){
            int minIndex = i; //가장 적은 원소의 인덱스

            for(int j=i+1 ; j < time.length; j++){
                if(time[minIndex].end > time[j].end )
                    minIndex = j;
            }

            ConferenceTime tmp = time[i];
            time[i] = time[minIndex];
            time[minIndex] = tmp;
        }
    }

    static void sortTimeStart(ConferenceTime[] time){
        for(int i=1; i < time.length; i++){
          if(time[i].end == time[i-1].end){
              if(time[i].start < time[i-1].start){
                  ConferenceTime tmp = time[i];
                  time[i] = time[i-1];
                  time[i-1] = tmp;
              }
          }
        }
    }

    static int solution(ConferenceTime[] time){
        int end = time[0].end;
        int answer = 1;

        for(int i = 1; i < time.length; i++){

            if(time[i].start >= end){
                end = time[i].end;
                answer++;
            }
        }
        return answer;
    }
}
