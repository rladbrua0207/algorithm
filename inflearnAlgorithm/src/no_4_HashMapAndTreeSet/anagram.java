package no_4_HashMapAndTreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class anagram {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String str1 = br.readLine();
        String str2 = br.readLine();

        String answer = "YES";

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char key : str1.toCharArray()) {
            map1.put(key, map1.getOrDefault(key, 0) + 1);
        }
        for (char key : str2.toCharArray()) {
            map2.put(key, map2.getOrDefault(key, 0) + 1);
        }

        for (char key : str1.toCharArray()) {
            if(map1.get(key) != map2.get(key)){
                answer = "NO";
                break;
            }
        }
        System.out.println(answer);
    }
}
