package SortingAndSearching_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class binarySearch {
    public int solution(int N, int M, int[] arr) {
        Arrays.sort(arr);
        int lt = 0;
        int rt = N - 1;
        int mid = 0;
        while (lt<=rt) {
            mid = (lt + rt) / 2;
            if (M == arr[mid]) break;
            else if (M < arr[mid]) rt = mid-1;
            else if (M > arr[mid]) lt = mid+1;
        }
        return mid+1;
    }

    public static void main(String[] args) throws IOException {
        binarySearch T = new binarySearch();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
        int answer = T.solution(N, M, arr);
        System.out.print(answer);
    }
}