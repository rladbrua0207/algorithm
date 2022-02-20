package no_6_SortingAndSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class leastRecentlyUsed_R {
    public ArrayList solution(int N, int S, int[] task) {
        ArrayList<Integer> cache = new ArrayList();
        cache.add(task[0]);
        for(int index = 1; index < N;){
            if(cache.contains(task[index])){
                for (int i = 0; i < cache.size(); i++) {
                    if (task[index] == cache.get(i)) cache.remove(i);
                }
            }else{
                if (cache.size() == S) cache.remove(S - 1);
            }
            cache.add(0, task[index++]);
        }
        return cache;
    }

    public static void main(String[] args) throws IOException {
        leastRecentlyUsed_R T = new leastRecentlyUsed_R();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] task = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) task[i] = Integer.parseInt(st.nextToken());
        ArrayList answer = T.solution(N, S, task);
        for(int i = 0; i < answer.size(); i++) System.out.print(answer.get(i) + " ");
    }
}
