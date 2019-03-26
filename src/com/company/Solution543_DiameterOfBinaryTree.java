package com.company;

public class Solution543_DiameterOfBinaryTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int dia = maxDepth(root.left)+maxDepth(root.right);
        int childrenDia = Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right));
        return Math.max(dia,childrenDia);
    }

    public int maxDepth(TreeNode root) {
        if(root ==null) return 0;
        return 1+ Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
