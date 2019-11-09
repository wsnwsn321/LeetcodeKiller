package com.company;

import java.util.*;

public class Solution589_NaryTreePreorderTraversal {
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
        Stack<Node> s = new Stack<>();
        List<Integer> res = new ArrayList<>();
        s.push(root);
        while (s.size()>0){
            Node cur = s.pop();
            res.add(cur.val);
            for (int i=cur.children.size()-1;i>=0;--i){
                s.push(cur.children.get(i));
            }
        }
        return res;

    }


}
