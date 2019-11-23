package com.company;

public class Solution114_FlattenBinaryTreetoLinkedList {
    public static void main(String[] args) {

    }
    TreeNode prev = null;
    public void flatten(TreeNode root) {
        if (root==null) return;
        prev = root;
        flatten(root.left);
        flatten(root.right);
        prev.right = root;
    }

}
