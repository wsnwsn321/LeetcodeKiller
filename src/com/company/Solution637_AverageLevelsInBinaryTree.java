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
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> s = new LinkedList<>();
        s.offer(root);
        while(s.size()>0){
            int size = s.size();
            int count = s.size();
            int sum=0;
            double avg=0;
            while(size>0){
                TreeNode temp = s.remove();
                sum +=temp.val;
                if(temp.left!=null) s.offer(temp.left);
                if(temp.right!=null) s.offer(temp.right);
                size--;
            }
            avg = sum/count;
            res.add(avg);
        }
        return res;

    }


}
