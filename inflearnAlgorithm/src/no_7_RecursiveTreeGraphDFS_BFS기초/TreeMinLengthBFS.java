package no_7_RecursiveTreeGraphDFS_BFS기초;

import java.util.LinkedList;
import java.util.Queue;

//class Node{
//    int data;
//    Node lt, rt;
//    public Node(int val) {
//        data=val;
//        lt=rt=null;
//    }
//
//}

public class TreeMinLengthBFS {
    Node root;
    Queue<Node> Q = new LinkedList();

    public int BFS(Node root){
        int L = 0;
        Q.offer(root);
        while (!Q.isEmpty()){
            int size = Q.size();
            for(int i = 0; i < size; i++){
                Node a = Q.poll();
                if(a.lt != null) Q.offer(a.lt);
                else if(a.rt != null) Q.offer(a.rt);
                else return L;

            }
            L++;
        }
        return 0;
    }

    public static void main(String args[]){
        TreeMinLengthBFS tree = new TreeMinLengthBFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.BFS( tree.root));
    }
}
