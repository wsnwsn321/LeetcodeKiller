package com.company;

public class Solution114_FlattenBinaryTreetoLinkedList {
    public static void main(String[] args) {

    }
    TreeNode prev = null;
    public void flatten(TreeNode root) {
        if (root==null) return;
        flatten(root.right);
        flatten(root.left);
        root.left=null;
        root.right = prev;
        prev = root;
    }

}
