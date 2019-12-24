package com.company;

public class Solution298_BinaryTreeLongestConsecutiveSequence {
    public static void main(String[] args) {

    }
    int max =0;
    public int longestConsecutive(TreeNode root) {
        if (root==null)
            return 0;
        travel(root);
        return max;
    }

    public int travel(TreeNode root) {
        if (root == null)
            return 0;
        int leftLength = travel(root.left);
        int rightLength = travel(root.right);
        if (root.left != null && root.val + 1 == root.left.val)
            leftLength++;
        else leftLength = 1;
        if (root.right != null && root.val + 1 == root.right.val)
            rightLength++;
        else rightLength = 1;
        max = Math.max(max, Math.max(leftLength, rightLength));
        return Math.max(leftLength, rightLength);
    }
}
