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
        if (root==null)
            return 0;
        int left = diameterOfBinaryTree(root.left);
        int right = diameterOfBinaryTree(root.right);
        return left+right;
    }


}
