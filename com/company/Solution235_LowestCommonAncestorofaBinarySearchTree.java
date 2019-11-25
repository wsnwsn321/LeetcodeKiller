package com.company;

public class Solution235_LowestCommonAncestorofaBinarySearchTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null||root==p||root==q) return root;
        if ((p.val<root.val&&q.val>root.val)||((p.val>root.val&&q.val<root.val)))
            return root;
        if (p.val<root.val&&q.val<root.val)
            return lowestCommonAncestor(root.left,p,q);
        else
            return lowestCommonAncestor(root.right,p,q);
    }
}
