package com.company;

public class Solution124_BinaryTreeMaximumPathSum {
    public static void main(String[] args) {
        TreeNode o = new TreeNode(1);
        TreeNode tw = new TreeNode(2);
        TreeNode th = new TreeNode(3);
        o.left = tw;
        o.right = th;
        //maxPathSum(o);

    }
     int res =Integer.MIN_VALUE;
    public  int maxPathSum(TreeNode root) {
        helper(root);
        return res;
    }

    public int helper(TreeNode root) {
        if (root == null)
            return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        left = left > 0 ? left : 0;
        right = right > 0 ? right : 0;
        int turningValue = left + right + root.val;
        res = Math.max(res, turningValue);
        return Math.max(left, right) + root.val;
    }


}
