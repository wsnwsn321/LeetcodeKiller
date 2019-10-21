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
    int res;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root==null) return 0;
        diameters(root);
        return res;
    }
    public int diameters(TreeNode root){
        if (root==null) return 0;
        int L = diameters(root.left);
        int R = diameters(root.right);
        res = Math.max(res,L+R);
        return Math.max(L,R)+1;
    }

}
