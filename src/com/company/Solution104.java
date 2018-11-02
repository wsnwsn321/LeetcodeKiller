package com.company;

public class Solution104 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public static void main(String[] args) {

    }
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return Math.max(1+maxDepth(root.left),1+maxDepth(root.right));
    }
}
