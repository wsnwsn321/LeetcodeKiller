package com.company;

import java.util.*;

public class Solution133_CloneGraph {

    // Definition for a Node.
    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
        }

        public Node(int _val, List<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    ;

    public static void main(String[] args) {

    }

    public Node cloneGraph(Node node) {
        Map<Node,Node> visited = new HashMap();
        Queue<Node> q = new LinkedList<>();
        visited.put(node, new Node(node.val,new ArrayList<>()));
        q.offer(node);
        while (q.size()>0){
            Node cur = q.poll();
            for (Node n:cur.neighbors){
                if (!visited.containsKey(n)){
                    q.offer(n);
                    visited.put(n,new Node(n.val,new ArrayList<>()));
                }
                visited.get(cur).neighbors.add(n);
            }
        }
        return visited.get(node);
    }
}
