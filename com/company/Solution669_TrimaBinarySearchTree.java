package com.company;

public class Solution669_TrimaBinarySearchTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {

    }
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root==null) return null;
        if (root.val<L){
            root = trimBST(root.right,L,R);
        }
        else if (root.val>R){
            root = trimBST(root.left,L,R);
        }
        else {
            root.left = trimBST(root.left,L,R);
            root.right = trimBST(root.right,L,R);
        }
        return root;
    }

}
