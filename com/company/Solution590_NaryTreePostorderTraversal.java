package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution590_NaryTreePostorderTraversal {
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
        List<Integer> res = new ArrayList<>();
        Stack<Node> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            Node temp = s.pop();
            res.add(0,temp.val);
            List<Node> c = root.children;
            for(int i=0;i<c.size();++i){
                s.push(c.get(i));
            }

        }
        return res;
    }


}
