package com.company;

import java.util.Arrays;

public class Solution654 {
    public static void main(String[] args) {
        int[] a = new int[]{3, 2, 1, 6, 0, 5};

    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {

        return helper(nums,0,nums.length);

    }
    public TreeNode helper(int[] nums, int l,int r){
        if(l<r){
            int i = max(nums,l,r);
            TreeNode root = new TreeNode(nums[i]);
            root.left = helper(nums,l,i);
            root.right = helper(nums,i+1,r);
            return root;
        }
        else{
            return null;
        }



    }
    public int max(int[] nums, int l, int r) {
        int max_i = l;
        for (int i = l; i < r; i++) {
            if (nums[max_i] < nums[i])
                max_i = i;
        }
        return max_i;
    }

}
