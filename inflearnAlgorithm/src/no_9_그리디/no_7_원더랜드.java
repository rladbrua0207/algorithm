package no_9_그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class City implements Comparable<City> {
    int c1, c2, cost;
    public City(int c1, int c2, int cost) {
        this.c1 = c1;
        this.c2 = c2;
        this.cost = cost;
    }
    @Override
    public int compareTo(City o) {
        return this.cost - o.cost;
    }// cost가 같을때도 넣어줘야할까? => X
}

public class no_7_원더랜드 {
    static City[] cities;
    static int[] cVertex;
    static int findParent(int c){
        if(cVertex[c] == c) return c;
        else return cVertex[c] = findParent(cVertex[c]);
    }
    static void union(City city){
        int c1 = findParent(city.c1);
        int c2 = findParent(city.c2);
        if(c1 != c2) cVertex[c1] = c2;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        cVertex = new int[V+1];
        for(int i = 1; i <= V; i++) cVertex[i] = i;

        cities = new City[E];
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int c1 = Integer.parseInt(st.nextToken());
            int c2 = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            cities[i] = new City(c1, c2, cost);
        }
        Arrays.sort(cities);

        int answer = 0;
        for(int i = 0; i < E; i++){
            int c1 = cities[i].c1;
            int c2 = cities[i].c2;
            if(findParent(c1) != findParent(c2)){
                union(cities[i]);
                answer += cities[i].cost;
            }
        }
        System.out.println(answer);
    }
}
