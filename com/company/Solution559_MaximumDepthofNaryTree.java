package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution559_MaximumDepthofNaryTree {
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
       if (root==null) return 0;
       if (root.children.size()==0) return 1;
       int maxD=0;
       for (Node x:root.children){
           maxD = Math.max(maxD,maxDepth(x)+1);
       }
       return maxD;
    }


}
