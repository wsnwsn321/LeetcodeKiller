package com.company;

import java.util.List;

public class Solution559 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public static void main(String[] args) {

    }

    public static int maxDepth(Node root) {
        int maxD = 0,depth =0;
        if(root.children==null) return 0;
       for(int i=0;i<root.children.size();i++){
           depth = 1+maxDepth(root.children.get(i));
           if(depth>maxD) maxD = depth;
       }
       return maxD;
    }

}
