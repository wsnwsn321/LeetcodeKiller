package com.company;

import java.util.HashMap;
import java.util.Map;

public class Solution105_ConstructBinaryTreefromPreorderandInorderTraversal {
    public static void main(String[] args) {

    }
    int pre_idx = 0;
    HashMap<Integer, Integer> idx_map = new HashMap<Integer, Integer>();

    public TreeNode helper(int in_left, int in_right,int[] preorder) {
        // if there is no elements to construct subtrees
        if (in_left == in_right)
            return null;

        // pick up pre_idx element as a root
        int root_val = preorder[pre_idx];
        TreeNode root = new TreeNode(root_val);

        // root splits inorder list
        // into left and right subtrees
        int index = idx_map.get(root_val);

        // recursion
        pre_idx++;
        // build left subtree
        root.left = helper(in_left, index,preorder);
        // build right subtree
        root.right = helper(index + 1, in_right,preorder);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // build a hashmap value -> its index
        int idx = 0;
        for (Integer val : inorder)
            idx_map.put(val, idx++);
        return helper(0, inorder.length,preorder);
    }
}
