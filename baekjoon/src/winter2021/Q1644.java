package winter2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q1644 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] primeArr = new int[n+1];
        for(int i = 2; i < primeArr.length; i++){
            primeArr[i] = i;
        }
        for(int i = 2; i * i <= n; i++){
            for(int j = i*2; j <= n; j+=i){
                primeArr[j] = 0;
            }
        }

        ArrayList<Integer> arrayList = new ArrayList<>();


        for(int i = 0 ;i < primeArr.length; i++){
            if(primeArr[i] != 0){
                arrayList.add(primeArr[i]);
            }
        }

        int lt = 0;
        int count = 0;
        int sum = 0;
        for(int rt = 0; rt < arrayList.size(); rt++){
            sum += arrayList.get(rt);
            if(sum == n){
                count++;
            }
            while (sum > n){
                sum -= arrayList.get(lt++);
                if(sum == n){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
