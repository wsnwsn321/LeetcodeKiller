package com.company;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution199_BinaryTreeRightSideView {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (q.size()>0){
            int size = q.size();
            for (int i=0;i<size;++i){
                TreeNode cur = q.poll();
                if (i==0) res.add(cur.val);
                if (cur.right!=null) q.offer(cur.right);
                if (cur.left!=null) q.offer(cur.left);
            }
        }
        return res;
    }



}
