package com.company;

public class Solution114_FlattenBinaryTreetoLinkedList {
    public static void main(String[] args) {

    }
    public void flatten(TreeNode root) {
        root = helper(root, null);
    }

    public TreeNode helper(TreeNode root, TreeNode pre) {
        if (root == null) return null;
        pre = helper(root.right, pre);
        pre = helper(root.left, pre);
        root.right = pre;
        root.left = null;
        pre = root;
        return pre;
    }

}
