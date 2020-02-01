package com.company;

public class Solution98_ValidateBinarySearchTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {

    }

    //time:     O(N) number of treenodes
    //space:    O(N)
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        return validate(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean validate(TreeNode root, int low, int high) {
        if (root == null) return true;
        if (root.val < low || root.val > high) return false;
        return validate(root.left, low, root.val) && validate(root.right, root.val, high);
    }

}
