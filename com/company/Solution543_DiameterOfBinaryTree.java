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
    int ans =0;
    public int diameterOfBinaryTree(TreeNode root) {
        getDiameter(root);
        return ans;
    }

    public int  getDiameter(TreeNode root){
        if (root==null) return 0;
        int lheight = getDiameter(root.left);
        int rheight = getDiameter(root.right);
        ans = Math.max(ans,lheight+rheight);
        return Math.max(lheight,rheight)+1;
    }


}
