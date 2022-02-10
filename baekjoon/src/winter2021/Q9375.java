package winter2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

class Q9375 {
    static ArrayList<Integer> answer;

    public static void compare(ArrayList<String> arr){
        HashMap<String, Integer> map = new HashMap();
        for(int i = 0; i < arr.size(); i++) map.put(arr.get(i), map.getOrDefault(arr.get(i),0)+1);
        int val = 1;
        for(Object key : map.keySet()) val *= map.get(key)+1;
        answer.add(val - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<String>> arr = new ArrayList<>();
        answer = new ArrayList();

        for(int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            arr.add(new ArrayList<>());
            for(int j = 0; j < N; j++){
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                arr.get(i).add(st.nextToken());
            }
            compare(arr.get(i));
        }

        for(int a : answer) System.out.println(a);
    }
}