package no_10_dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Blick implements Comparable<Blick>{
    int area, high, weight;
    Blick(int area, int high, int weight){
        this.area = area;
        this.high = high;
        this.weight = weight;
    }
    @Override
    public int compareTo(Blick o) {
        return o.area - this.area;
    }
}
public class no_4_가장높은탑쌓기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Blick[] blicks = new Blick[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int area = Integer.parseInt(st.nextToken());
            int high = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            blicks[i] = new Blick(area, high, weight);
        }
        Arrays.sort(blicks);

        int[] dp = new int[N];
        dp[0] = blicks[0].high;
        int answer = 0;
        for(int i = 1; i < N; i++){
            int high = 0;
            for(int j = 0; j < i; j++){
                if(blicks[i].weight < blicks[j].weight && dp[j] > high){
                    high = dp[j];
                }
            }
            dp[i] = high + blicks[i].high;
            answer = Math.max(answer, dp[i]);
        }
        System.out.println(answer);
    }
}
