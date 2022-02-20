package no_6_SortingAndSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class leastRecentlyUsed {
    public ArrayList solution(int N, int S, int[] task) {
        ArrayList<Integer> cache = new ArrayList();
        cache.add(task[0]);
        for(int index = 1; index < N;) {
            for (int j = 0; j < cache.size(); j++) {
                if (task[index] == cache.get(j)) {
                    cache.remove(j);
                    cache.add(0, task[index++]);
                    break;
                }else if(j == S-1){
                    cache.remove(S - 1);
                    cache.add(0, task[index++]);
                }else if(j == cache.size() - 1){
                    cache.add(0, task[index++]);
                }
            }
        }

        return cache;
    }

    public static void main(String[] args) throws IOException {
        leastRecentlyUsed T = new leastRecentlyUsed();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] task = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) task[i] = Integer.parseInt(st.nextToken());
        ArrayList answer = T.solution(N, S, task);
        for(int i = 0; i < answer.size(); i++)System.out.print(answer.get(i) + " ");
    }
}
