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
        //cur[0] returns max as cur node is the top of my path (turning point)
        //cur[1] returns max as cur node is in one node in the path
        int cur,top;
        int left = helper(root.left);
        int right = helper(root.right);
        left = Math.max(0,left);
        right =Math.max(0,right);
        cur = root.val+left+right;
        top = root.val+Math.max(left,right);
        res = Math.max(res,Math.max(cur,top));
        return top;
    }
}
