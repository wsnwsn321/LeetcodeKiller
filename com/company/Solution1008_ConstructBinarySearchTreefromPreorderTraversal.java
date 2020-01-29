package com.company;

import java.util.Stack;

public class Solution1008_ConstructBinarySearchTreefromPreorderTraversal {
    public static void main(String[] args) {

    }
    int index =0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return buildTree(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    public TreeNode buildTree(int[] preorder,int low,int high){
        if (index==preorder.length) return null;
        int val = preorder[index];
        if (val<low||val>high) return null;
        TreeNode node = new TreeNode(preorder[index++]);
        node.left = buildTree(preorder,low,node.val);
        node.right = buildTree(preorder,node.val,high);
        return node;
    }
}
