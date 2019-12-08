package com.company;

import java.util.HashMap;
import java.util.Map;

public class Solution105_ConstructBinaryTreefromPreorderandInorderTraversal {
    public static void main(String[] args) {

    }
    int pre_idx = 0;
    HashMap<Integer, Integer> inorderMap = new HashMap<Integer, Integer>();

    public TreeNode helper(int in_left, int in_right,int[] preorder) {
        if (in_left > in_right)
            return null;
        int inorderIndex = inorderMap.get(preorder[pre_idx]);
        TreeNode root = new TreeNode(preorder[pre_idx++]);
        root.left = helper(in_left, inorderIndex - 1, preorder);
        root.right = helper(inorderIndex + 1, in_right, preorder);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; ++i)
            inorderMap.put(inorder[i], i);
        return helper(0, inorder.length - 1, preorder);
    }
}
