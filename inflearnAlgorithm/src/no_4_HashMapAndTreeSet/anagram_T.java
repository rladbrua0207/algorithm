package no_4_HashMapAndTreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class anagram_T {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        String answer = "YES";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char key : str1.toCharArray()) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        for (char key : str2.toCharArray()) {
            if(!map.containsKey(key) || map.get(key) == 0){
                answer = "NO";
                break;
            }
            map.put(key, map.get(key)-1);
        }
        System.out.println(answer);
    }
}
