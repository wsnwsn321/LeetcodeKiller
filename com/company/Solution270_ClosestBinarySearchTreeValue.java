package com.company;

import java.util.Stack;

public class Solution270_ClosestBinarySearchTreeValue {
    public static void main(String[] args) {

    }
    public int closestValue(TreeNode root, double target) throws Exception {
        if (root == null)
            throw new Exception("tree is null!");
        int closest = root.val;
        while (root != null) {
            if (root.val == target) return root.val;
            closest = Math.abs(root.val - target) < Math.abs(closest - target) ? root.val : closest;
            if (root.val > target)
                root = root.left;
            else
                root = root.right;
        }
        return closest;
    }

}
