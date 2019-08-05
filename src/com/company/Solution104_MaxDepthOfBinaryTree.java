package com.company;

import java.util.HashMap;
import java.util.Map;

public class Solution104_MaxDepthOfBinaryTree {
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
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return Math.max(1+maxDepth(root.left),1+maxDepth(root.right));
    }
}
