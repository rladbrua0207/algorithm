package Array_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class reversePrime {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        String[] reverse = new String[t];
        StringTokenizer st = new StringTokenizer(br.readLine());


        int[] arr = new int[100001];

        

        arr[1] = 1;
        for(int i = 2; i * i< 100001; i++) {
            if (arr[i] == 0) {
                for (int j = i * i; j < 100001; j = j + i) {
                    arr[j] = 1;
                }
            }//에라테스토스의 체로 다시
        }
        for(int i = 0; i < t; i++){
            reverse[i] = st.nextToken();
            reverse[i] = new StringBuilder(reverse[i]).reverse().toString();
            if(arr[Integer.parseInt(reverse[i])] ==0){
                System.out.print(Integer.parseInt(reverse[i])+ " ");
            }
        }
    }
}
