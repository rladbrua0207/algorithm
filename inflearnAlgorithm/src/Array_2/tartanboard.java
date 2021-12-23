package Array_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class tartanboard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] bingo = new int[n][n];
        ArrayList<Integer> sumArr = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                bingo[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int sum = 0;
        for(int i = 0; i <n; i++){
            for(int j = 0; j < n; j++){
                sum += bingo[i][j];
            }
            sumArr.add(sum);
            sum = 0;
        }
        for(int i = 0 ; i < n; i++){
            for(int j =0; j < n; j++){
                sum += bingo[j][i];
            }
            sumArr.add(sum);
            sum = 0;
        }
        for(int i = 0; i < n; i++){
            sum += bingo[i][i];
        }
        sumArr.add(sum);
        sum = 0;
        for(int i = n-1; i >= 0; i--){
            sum += bingo[i][i];
        }
        sumArr.add(sum);

        Collections.sort(sumArr, Collections.reverseOrder());
        System.out.print(sumArr.get(0));
    }
}
