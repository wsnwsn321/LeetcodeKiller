package com.company;
public class Solution110_BalancedBinaryTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public boolean isBalanced(TreeNode root) {
        if (root==null) return true;
        getDepth(root);
        return res==-1?false:true;
    }
    int res=0;
    public int getDepth(TreeNode root){
        if (root==null) return 0;
        int l = getDepth(root.left);
        int r = getDepth(root.right);
        if (res==-1) return res;
        if (Math.abs(l-r)>1) {
            res =-1;
            return res;
        }
        return Math.max(l,r)+1;
    }
}
