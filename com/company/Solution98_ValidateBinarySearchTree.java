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
    public boolean isValidBST(TreeNode root){
        return validate(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean validate(TreeNode root,long lower, long upper){
        if (root==null) return true;
        return (root.val<upper&&root.val>lower)&&
                validate(root.left,lower,root.val)&&
                validate(root.right,root.val,upper);
    }


}
