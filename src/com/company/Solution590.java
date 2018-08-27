package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution590 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public static void main(String[] args) {

    }

    public List<Integer> postorder(Node root) {
        List<Integer> a = new ArrayList<>();
        generateList(a,root);
        return a;
    }
    public void generateList(List<Integer> l,Node n){
        if(n==null) return;
        if(n.children.isEmpty()) l.add(n.val);
        else{
            for(Node x:n.children){
                generateList(l,x);
            }
            l.add(n.val);
        }

    }

}
