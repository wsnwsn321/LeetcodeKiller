package com.company;

public class Solution965_UnivaluedBinaryTree {
    public static void main(String[] args) {

    }
    public boolean isUnivalTree(TreeNode root) {
        if (root==null) return true;
        return travel(root,root.val);
    }

    public boolean travel(TreeNode root, int val) {
        if (root==null) return true;
        return root.val==val&&travel(root.left,val)&&travel(root.right,val);
    }
}
