package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution589 {
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

    public List<Integer> preorder(Node root) {
        List<Integer> r = new ArrayList<>();
        addInt(root,r);
        return r;
    }

    public void addInt(Node root, List<Integer> r) {
        if(root==null) return;
        r.add(root.val);
        for(Node n:root.children){
            addInt(n,r);
        }
    }
}
