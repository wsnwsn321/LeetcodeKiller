package com.company;

public class Solution98_ValidateBinarySearchTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    //time:     O(N) number of treenodes
    //space:    O(N)
    public boolean isValidBST(TreeNode root) {
        if (root==null) return true;
        return helper(root,Long.MAX_VALUE,Long.MIN_VALUE);
    }
    public boolean helper(TreeNode root,long upper ,long lower){
        if (root==null) return true;
        return
                root.val <upper&&root.val>lower&&
                        helper(root.left,root.val,lower)&&helper(root.right,upper,root.val);
    }

}
