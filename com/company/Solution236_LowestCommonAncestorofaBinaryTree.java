package com.company;

public class Solution236_LowestCommonAncestorofaBinaryTree {
    public static void main(String[] args) {

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null||root==p||root==q) return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if (left!=null&&right!=null)
            return root;
        if (left==null)
            return right;
        return left;

    }
}
