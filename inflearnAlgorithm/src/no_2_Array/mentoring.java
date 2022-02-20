package no_2_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class mentoring {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());
        int[][] stu = new int[m][n];
        int match = 0;
        int cnt1 = 0;
        int cnt2 = 0;

        for(int i = 0; i < m; i++){//3
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for(int j = 0; j <n; j++){ //4
                stu[i][j] = Integer.parseInt(st2.nextToken());
            }
        }

        for(int j = 0; j < n-1; j++){
            for(int i = j+1; i < n; i++){
                for(int k = 0; k < m; k++) {
                    if (stu[k][j] < stu[k][i]) {
                        cnt1++;
                    } else if (stu[k][j] > stu[k][i]) {
                        cnt2++;
                    }
                    if (cnt1 == m || cnt2 == m) {
                        match++;
                    }
                }
            }
            cnt1 = 0;
            cnt2 = 0;
        }

        System.out.println(match);
    }
}
