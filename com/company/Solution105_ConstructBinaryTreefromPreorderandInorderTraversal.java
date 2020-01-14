package com.company;

import java.util.HashMap;
import java.util.Map;

public class Solution105_ConstructBinaryTreefromPreorderandInorderTraversal {
    public static void main(String[] args) {

    }
    HashMap<Integer, Integer> inorderMap = new HashMap<Integer, Integer>();

    //given node A with position i in preorder, nodes before i is on A's left and nodes after i is on A's right
    //in inorder array
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; ++i) {
            inorderMap.put(i, inorder[i]);
        }
        return helper(preorder, 0, inorder, 0, inorder.length - 1);
    }

    public TreeNode helper(int[] preoder,  int rootIndex,int[] inorder,int left, int right) {
        //rootIndex: index of root in preorder array
        if (left > right)
            return null;
        TreeNode root = new TreeNode(preoder[rootIndex]);
        //InorderRootIndex: index of root in inorder array
        int InorderRootIndex = inorderMap.get(root.val);
        root.left = helper(preoder, rootIndex + 1, inorder, left, InorderRootIndex - 1);
        //InorderRootIndex - left: number of nodes on the left sight of the root
        //rootIndex + (InorderRootIndex - left) + 1 : skip all nodes on the left of the root to get the immediate
        // right node of the current node.
        int rightNodeIndex = rootIndex + (InorderRootIndex - left) + 1;
        root.right = helper(preoder, rightNodeIndex, inorder, InorderRootIndex + 1, right);
        return root;
    }

}
