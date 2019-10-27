package com.company;

public class Solution112_PathSum {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean hasPathSum(TreeNode root, int sum) {
         return travel(root,sum);

    }

    public boolean travel(TreeNode root, int sum){
        if (root==null) return false;
        if (root.left==null&&root.right==null){
            if (sum-root.val==0)
                return true;
        }
        return travel(root.left,sum-root.val)||travel(root.right,sum-root.val);

    }
}
