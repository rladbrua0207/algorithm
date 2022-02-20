package no_6_SortingAndSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class doubleCheck {
    public char solution(int N, int[] arr) {
        Arrays.sort(arr);
        for(int i = 0; i < N-1; i++) if(arr[i] == arr[i+1])  return 'D';
        return 'U';
    }

    public static void main(String[] args) throws IOException {
        doubleCheck T = new doubleCheck();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
        char answer = T.solution(N, arr);
        System.out.println(answer);
    }
}
