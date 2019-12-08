package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Solution222_CountCompleteTreeNodes {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    public int countNodes(TreeNode root) {
        if (root == null) return 0;

        int d = getDepth(root);
        // if the tree contains 1 node
        if (d == 0) return 1;
        // Last level nodes are enumerated from 0 to 2**d - 1 (left -> right).
        // Perform binary search to check how many nodes exist.
        int left = 1, right = (int) Math.pow(2, d) - 1;
        int pivot;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (existNode(root, pivot, d)) left = pivot + 1;
            else right = pivot - 1;
        }

        return (int) Math.pow(2, d) - 1 + left;
    }

    public int getDepth(TreeNode root) {
        int height=0;
        while (root.left!=null){
            height++;
            root = root.left;
        }
        return height;
    }
    public boolean existNode(TreeNode root, int index,int d){
        int l = 0, r = (int)Math.pow(2,d)-1;
        for(int i = 0; i < d; ++i) {
            int mid = l + (r - l) / 2;
            if (index <= mid) {
                root = root.left;
                r = mid;
            }
            else {
                root = root.right;
                l = mid + 1;
            }
        }
        return root==null;
    }
}
