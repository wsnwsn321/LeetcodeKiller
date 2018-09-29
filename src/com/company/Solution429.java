package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution429 {

    static class Node {
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

    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.size()!=0){
            int count =q.size();
            List<Integer> level = new ArrayList<>();
            while(count>0){
                Node n = q.remove();
                level.add(n.val);
                for(Node x:n.children){
                    q.add(x);
                }
                count--;
            }
            result.add(level);
        }
        return result;



    }



}
