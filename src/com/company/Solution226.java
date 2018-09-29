package com.company;

public class Solution226 {

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
    public static TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        TreeNode temp = root.left;
        root.left= root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
