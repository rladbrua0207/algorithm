package HashMap_TreeSet_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class kindOfSales {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        ArrayList answer = new ArrayList();
        HashMap<Integer,Integer> map = new HashMap();

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for(int i = 0; k < n; i++){
            answer.add(map.size());
            map.put(arr[i], map.get(arr[i]) - 1);
            map.put(arr[k],map.getOrDefault(arr[k++],0) + 1);

            if(map.get(arr[i]) == 0) map.remove(arr[i]);
            if(k == n){
                answer.add(map.size());
                break;
            }
        }
        for(int i = 0; i < answer.size(); i++){
            System.out.print(answer.get(i)+ " ");
        }
    }
}
