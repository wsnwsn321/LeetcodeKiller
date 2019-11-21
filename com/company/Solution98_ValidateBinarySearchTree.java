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
        return validate(root,Long.MAX_VALUE,Long.MIN_VALUE);
    }
    public boolean validate(TreeNode root,long leftMax, long rightMin){
        if (root==null) return true;
        return (root.val<leftMax&&root.val>rightMin)&&
                validate(root.left,root.val,rightMin)&&
                validate(root.right,leftMax,root.val);
    }


}
