package Array_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class peaks {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int[][] bingo = new int[n+2][n+2];

        for(int i = 1; i < n+1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 1; j < n+1; j++){
                bingo[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < n+1; j++){
                if(bingo[i][j] > bingo[i-1][j] && bingo[i][j] > bingo[i+1][j] && bingo[i][j] > bingo[i][j-1] && bingo[i][j] > bingo[i][j+1]){
                    count ++;
                }
            }
        }
        System.out.println(count);
    }
}
