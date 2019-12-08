package com.company;

public class Solution124_BinaryTreeMaximumPathSum {
    public static void main(String[] args) {
        TreeNode o = new TreeNode(1);
        TreeNode tw = new TreeNode(2);
        TreeNode th = new TreeNode(3);
        o.left = tw;
        o.right = th;
        maxPathSum(o);

    }
    static int res =Integer.MIN_VALUE;
    public static int maxPathSum(TreeNode root) {
        helper(root);
        return res;
    }

    public static int helper(TreeNode root){
        if (root==null)
            return 0;
        //node means current node is in the path(not the turning point)
        //top means current node is the turning point
        int node,top;
        int left = helper(root.left);
        int right = helper(root.right);
        left = Math.max(0,left);
        right =Math.max(0,right);
        top = root.val+left+right;
        node = root.val+Math.max(left,right);
        res = Math.max(res,top);
        return node;
    }
}
