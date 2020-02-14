package com.company;

import java.util.Stack;

public class Solution270_ClosestBinarySearchTreeValue {
    public static void main(String[] args) {

    }
    public int closestValue(TreeNode root, double target) {
        int cloest = root.val;
        while (root != null) {
            cloest = Math.abs(root.val - target) < Math.abs(cloest - target) ? root.val : cloest;
            if (root.val < target)
                root = root.right;
            else
                root = root.left;
        }
        return cloest;
    }

}
