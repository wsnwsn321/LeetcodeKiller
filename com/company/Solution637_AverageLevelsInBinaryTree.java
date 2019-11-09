package com.company;

import java.util.*;

public class Solution637_AverageLevelsInBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {

    }
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        List<Double> res = new ArrayList<>();
        while (q.size()>0){
            int size = q.size();
            int temp =size;
            double sum=0;
            while (size>0){
                TreeNode cur = q.poll();
                sum+=cur.val;
                if (cur.left!=null) q.offer(cur.left);
                if (cur.right!=null) q.offer(cur.right);
                size--;
            }
            res.add(sum/temp);
        }
        return res;

    }


}
