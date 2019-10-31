package com.company;

public class Solution226_invertBinaryTree {

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
    public TreeNode invertTree(TreeNode root) {
        return travel(root);
    }
    public TreeNode travel(TreeNode root){
        if (root ==null) return null;
        TreeNode left = travel(root.left);
        TreeNode right = travel(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
