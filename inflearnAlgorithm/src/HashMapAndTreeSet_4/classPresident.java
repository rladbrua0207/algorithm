package HashMapAndTreeSet_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class classPresident {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char answer = ' ';
        String s = br.readLine();

        int max = Integer.MIN_VALUE;

        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : s.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
            //get의 값이 없을경우도 처리 x를 불러오되 x값이 없다면 0을 불러와라
        }
        for(char key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }
        System.out.println(answer);
//map.keySet() => map 객체 탐색
//map.containsKey('A') => map이라는 객체에 특정key가있냐없냐 true or false 리턴
//map.size() => key의 개수 리턴
//map.remove('A') => 특정 키 삭제
    }
}
