package winter2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, String> map1 = new HashMap<>();
        HashMap<String, String> map2 = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String str = br.readLine();
            map1.put(Integer.toString(i), str);
            map2.put(str, Integer.toString(i));
        }

        for(int i = 0; i < M; i++){
            String str = br.readLine();
            if(map1.containsKey(str)) sb.append(map1.get(str));
            else if(map2.containsKey(str)) sb.append(map2.get(str));
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
