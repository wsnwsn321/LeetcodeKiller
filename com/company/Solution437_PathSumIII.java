package com.company;

public class Solution437_PathSumIII {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    int res=0;
    public int pathSum(TreeNode root, int sum) {
        return res;
    }

    public int travel(TreeNode root, int sum){
        if (root==null) return 0;
        int left = travel(root.left,sum-root.val);
        int right = travel(root.right,sum-root.val);
        return root.val;
    }
}
