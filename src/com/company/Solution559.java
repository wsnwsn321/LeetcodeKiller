package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution559 {
    static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public static void main(String[] args) {
        List<Node> l = new ArrayList<>();
        Node b = new Node(2,null);
        l.add(b);
    Node a = new Node(1,l);
     int q = maxDepth(a);
    }

    public static int maxDepth(Node root) {
        int maxD = 0,depth =0;
        if(root == null) return 0;
        if(root.children.isEmpty()) return 1;

        for(int i=0;i<root.children.size();i++){
            depth = maxDepth(root.children.get(i));
            if(depth>maxD) maxD = depth;
        }


       return maxD+1;
    }

}
