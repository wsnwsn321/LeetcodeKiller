package com.company;


import java.util.Arrays;

public class Solution654_MaximumBinaryTree {
    public static void main(String[] args) {
        int[] a = new int[]{3, 2, 1, 6, 0, 5};

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length==0) return null;
        return buildTree(nums,0,nums.length-1);
    }

    public TreeNode buildTree(int[] nums,int l, int r) {
        if (nums.length==0) return null;
        if(l>r) return null;
        int index = findMaximumIndex(nums,l,r);
        TreeNode root = new TreeNode(nums[index]);
        root.left = buildTree(nums,l,index-1);
        root.right = buildTree(nums,index+1,r);
        return root;
    }

    public int findMaximumIndex(int[] nums, int l, int r){
        int maxIndex = l,maxNum = nums[l];
        for (int i=l;i<=r;++i){
            if (maxNum<nums[i]){
                maxNum = nums[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }


}
