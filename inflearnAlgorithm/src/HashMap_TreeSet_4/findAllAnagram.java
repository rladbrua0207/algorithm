package HashMap_TreeSet_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class findAllAnagram {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int answer = 0;
        char[] sArr = st.nextToken().toCharArray();

        st = new StringTokenizer(br.readLine());

        char[] tArr = st.nextToken().toCharArray();

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for(int i = 0; i < tArr.length; i++){
            tMap.put(tArr[i], tMap.getOrDefault(tArr[i], 0) + 1);
        }
        for(int i = 0; i < tArr.length; i++){
            sMap.put(sArr[i], sMap.getOrDefault(sArr[i], 0) + 1);
        }
        if (tMap.equals(sMap)) answer++;

        int lt = 0;
        for(int rt = tArr.length; rt < sArr.length; rt++){
            sMap.put(sArr[rt], sMap.getOrDefault(sArr[rt], 0) + 1);
            sMap.put(sArr[lt], sMap.get(sArr[lt]) - 1);
            if(sMap.get(sArr[lt]) == 0) sMap.remove(sArr[lt]);
            if (tMap.equals(sMap)) answer++;
            lt++;
        }
        System.out.println(answer);
    }
}
