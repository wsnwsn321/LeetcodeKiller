package com.company;

public class Solution1038_BSTtoGreaterSumTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public static void main(String[] args) {

    }
    int currentSum=0;
    public TreeNode bstToGst(TreeNode root) {
        if(root.right!=null){
            bstToGst(root.right);
        }
        root.val+=currentSum;
        currentSum = root.val;
        if(root.left!=null){
            bstToGst(root.left);
        }
        return root;
    }

}
