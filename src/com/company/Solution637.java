package com.company;

import java.util.*;

public class Solution637 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {

    }
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double > l = new ArrayList<>();
        Queue<TreeNode > tree = new LinkedList<>();
        tree.add(root);
        double sum = 0;
        int size =1, count=0;
        while(!tree.isEmpty()){
            sum = 0;
            size = tree.size();
            count = tree.size();
            while(size>0){
                TreeNode x = tree.remove();
                sum+=x.val;
                if(x.left!=null) tree.add(x.left);
                if(x.right!=null) tree.add(x.right);
                size--;
            }
            l.add(sum/count);
        }
        return l;


    }


}
