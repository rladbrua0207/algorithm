package no_4_HashMapAndTreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class kthLargestNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        HashMap map = new HashMap();

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int p = j+1; p < n; p++){
                    int key = arr[i] + arr[j] + arr[p];
                    map.put(key, key);
                }
            }
        }

        List<Integer> answer = new ArrayList<>(map.values());

        Collections.sort(answer);
        Collections.reverse(answer);
/**
        if(k <= map.size()){
            System.out.println(answer.get(k-1));
        }else{
            System.out.println(-1);
        }**/
        System.out.println(k <= map.size() ? answer.get(k-1) : -1);
    }
}
