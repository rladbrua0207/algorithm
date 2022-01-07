package HashMapAndTreeSet_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class kthLargestNum_T {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        TreeSet<Integer> tSet = new TreeSet<>(Collections.reverseOrder());
        //중복제거에 내림차순 정렬
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int p = j+1; p < n; p++){
                    tSet.add(arr[i] + arr[j] + arr[p]);
                }
            }
        }
        int cnt = 0;
        for(int x : tSet){
            cnt++;
            if(cnt==k) {
                System.out.println(x);
                System.exit(0);
            }
        }
        System.out.println(-1);


/**
 if(k <= map.size()){
 System.out.println(answer.get(k-1));
 }else{
 System.out.println(-1);
 }**/
    }
}
