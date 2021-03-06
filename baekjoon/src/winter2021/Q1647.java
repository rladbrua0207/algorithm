package winter2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

 class Tree1 implements Comparable<Tree1> {
    int t1, t2, cost;

    public Tree1(int t1, int t2, int cost) {
        this.t1 = t1;
        this.t2 = t2;
        this.cost = cost;
    }

    @Override
    public int compareTo(Tree1 o) {
        return this.cost - o.cost;
    }
}

public class Q1647 {
    static Tree1[] trees;
    static int[] vertex;

    static int findParent(int c){
        if(vertex[c] == c) return c;
        else return vertex[c] = findParent(vertex[c]);
    }
    static void union(Tree1 tree){
        int t1 = findParent(tree.t1);
        int t2 = findParent(tree.t2);
        if(t1 != t2) vertex[t1] = t2;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        vertex = new int[V+1];
        for(int i = 1; i <= V; i++) vertex[i] = i;

        trees = new Tree1[E];
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int t1 = Integer.parseInt(st.nextToken());
            int t2 = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            trees[i] = new Tree1(t1, t2, cost);
        }
        Arrays.sort(trees);

        int answer = 0;
        int lastCost = 0;

        for(int i = 0; i < E; i++){
            int t1 = trees[i].t1;
            int t2 = trees[i].t2;
            if(findParent(t1) != findParent(t2)){
                union(trees[i]);
                answer += trees[i].cost;
                lastCost = trees[i].cost;
            }
        }
        System.out.println(answer - lastCost);
    }
}
