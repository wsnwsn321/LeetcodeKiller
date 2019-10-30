package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Solution117_PopulatingNextRightPointersinEachNodeII {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;
        public Node() {}
        public Node(int _val,Node _left,Node _right,Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
    public static void main(String[] args) {

    }
    public Node connect(Node root)
    {
        if (root==null) return null;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (q.size()>0){
            Node cur = q.poll();
            int size = q.size();
            if (cur.left!=null) q.offer(cur.left);
            if (cur.right!=null) q.offer(cur.right);
            while (size>0){
                Node temp = q.poll();
                if (temp.left!=null) q.offer(temp.left);
                if (temp.right!=null) q.offer(temp.right);
                cur.next = temp;
                cur = cur.next;
                size--;
            }
        }
        return root;
    }

}
