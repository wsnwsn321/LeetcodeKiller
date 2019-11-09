package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution530_MinAbsoluteDiffBST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    TreeNode prev=null;
    int min = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        inOrderTraversal(root);
        return min;

    }
    public void inOrderTraversal(TreeNode r) {
        if (r == null) return;
        inOrderTraversal(r.left);
        if (prev!=null)
            min = Math.min(min,r.val-prev.val);
        prev = r;
        inOrderTraversal(r.right);
    }
}
