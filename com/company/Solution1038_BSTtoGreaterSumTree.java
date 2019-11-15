package com.company;

public class Solution1038_BSTtoGreaterSumTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public static void main(String[] args) {

    }
    int currentSum=0;
    public TreeNode bstToGst(TreeNode root) {
        if (root==null) return null;
        root.right = bstToGst(root.right);
        currentSum+=root.val;
        root.val =currentSum;
        root.left = bstToGst(root.left);
        return root;
    }


}
