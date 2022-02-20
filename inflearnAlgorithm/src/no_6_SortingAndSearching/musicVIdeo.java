package no_6_SortingAndSearching;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class musicVideo {
    public int count(int[] arr, int capacity) { //필요한 DVD 카운트
        int cnt = 1, sum = 0; //cnt는 DVD장 수 이므로 적어도 한장
        for (int x : arr) {
            if (sum + x > capacity) {
                cnt++;
                sum = x;
            } else sum += x;
        }
        return cnt;
    }

    public int solution(int M, int[] arr) {
        int answer = 0;
//        int maxValue = arr[0];
//        int sum = arr[0];
//        for (int i = 1; i < N; i++) {
//            if (arr[i] > maxValue) {
//                maxValue = arr[i];
//            }
//            sum += arr[i];
//        }
//        int lt = maxValue;
//        int rt = sum;

        int lt = Arrays.stream(arr).max().getAsInt(); //array값들 중 최대값
        int rt = Arrays.stream(arr).sum(); //array값들의 총 합

        while (lt <= rt) {//이분탐색 알고리즘즘
            int mid = (lt + rt) / 2;
            if (count(arr, mid) <= M) {
                answer = mid;
                rt = mid - 1;
            } else lt = mid + 1;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        musicVideo T = new musicVideo();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int answer = T.solution(M, arr);
        System.out.print(answer);
    }
}