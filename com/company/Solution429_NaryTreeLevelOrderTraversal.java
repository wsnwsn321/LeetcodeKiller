package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution429_NaryTreeLevelOrderTraversal {

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
        List<List<Integer>> res = new ArrayList<>();
        if (root==null) return res;
        Queue<Node> q= new LinkedList<>();
        q.offer(root);
        while (q.size()>0){
            res.add(new ArrayList<>());
            int size = q.size();
            while (size>0){
                Node cur = q.poll();
                res.get(res.size()-1).add(cur.val);
                for (Node child:cur.children){
                    q.offer(child);
                }
            }
        }
        return res;
    }



}
