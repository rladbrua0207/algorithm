package stackQueue_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class curriculumDesign {
    public String solution(String str, String str2){
        Queue<Character> queue = new LinkedList<>();
        String answer = "YES";
        for(char ch : str.toCharArray()) queue.offer(ch);
        for(char ch : str2.toCharArray())
            if(!queue.isEmpty() && ch == queue.peek()) queue.poll();
        if(queue.size() != 0) return "NO";

        return answer;
    }

    public static void main(String[] args) throws IOException {
        curriculumDesign T = new curriculumDesign();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String str2 = br.readLine();
        System.out.println(T.solution(str, str2));
    }
}