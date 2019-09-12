package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
        List<Integer> res = new ArrayList<>();
        Stack<Node> s = new Stack<>();
        if(root==null) return res;
        s.push(root);
        while(!s.isEmpty()){
            Node temp = s.pop();
            res.add(temp.val);
            for(int i=temp.children.size()-1;i>=0;--i){
                s.push(temp.children.get(i));
            }
        }
        return res;
    }


}
