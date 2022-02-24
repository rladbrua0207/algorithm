package no_9_그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Edge implements Comparable<Edge> {
    int vex, cost;

    public Edge(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }// cost가 같을때도 넣어줘야할까? => X
}

public class no_8_원더랜드_프림 {
    static int[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        check = new int[V + 1];

        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < E; i++) graph.add(new ArrayList<>());

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int e1 = Integer.parseInt(st.nextToken());
            int e2 = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            graph.get(e1).add(new Edge(e2, cost));
            graph.get(e2).add(new Edge(e1, cost));
        }

        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(1, 0));

        int answer = 0;
        while (!pQ.isEmpty()) {
            Edge edge = pQ.poll();
            if (check[edge.vex] == 0) {
                check[edge.vex] = 1;
                for (Edge ob : graph.get(edge.vex)) {
                    if(check[ob.vex] == 0) pQ.offer(ob);
                }
                answer += edge.cost;
            }
        }
        System.out.println(answer);
    }
}