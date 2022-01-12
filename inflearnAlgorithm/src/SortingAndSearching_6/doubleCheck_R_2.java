package SortingAndSearching_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class doubleCheck_R_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        char answer='U';

        HashMap<Integer,Integer> map = new HashMap<>();
        int value;
        for (int i = 0; i < N; i++) {
            value = Integer.parseInt(st.nextToken());
            if(map.containsKey(value)){
                answer= 'D';
                break;
            }
            map.put(value,1);

        }
        System.out.println(answer);
    }
}
