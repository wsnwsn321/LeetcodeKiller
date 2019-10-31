package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Solution222_CountCompleteTreeNodes {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    public int countNodes(TreeNode root) {
        if (root==null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        int res=0;
        q.offer(root);
        while (q.size()>0){
            TreeNode cur =q.poll();
            res++;
            if (cur.left!=null)
                q.offer(cur.left);
            if (cur.left!=null)
                q.offer(cur.left);
        }
        return res;
    }
}
