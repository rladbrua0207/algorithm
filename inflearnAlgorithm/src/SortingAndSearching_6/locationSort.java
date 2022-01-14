package SortingAndSearching_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class locationSort {
    public int[][] solution(int N, int[][] arr) {
        Arrays.sort(arr, (value1, value2)->{
            if(value1[0] == value2[0]){//x값끼리 비교
                return Integer.compare(value1[1],value2[1]);
            }else {//y값끼리 비교
                return Integer.compare(value1[0],value2[0]);
            }
        });

        return arr;
    }

    public static void main(String[] args) throws IOException {
        locationSort T = new locationSort();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        int[][] answer = T.solution(N, arr);
        for (int i = 0; i < answer.length; i++)
            System.out.println(answer[i][0] + " " + answer[i][1]);
    }
}