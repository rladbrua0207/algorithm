package Array_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class selectHead {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] group = new int[n][5];
        int[]sum = new int[n];
        int max = 0;
        int index = 0;

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 5; j++){
                group[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0 ;j < n; j++){
                for(int k = 0; k < 5; k++){
                    if(group[i][k] == group[j][k] ){
                        sum[i]++;
                        break;
                    }
                }
            }
            if(sum[i] > max){
                max = sum[i];
                index = i;
            }
        }
        System.out.println(index+1);
    }
}
