package com.company;

public class Solution404_SumOfLeftLeaves {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
  public static int sum=0;
    public static void main(String[] args) {

    }
    public int sumOfLeftLeaves(TreeNode root) {
        if (root==null) return 0;
        if (root.left!=null&&root.left==null&&root.right==null){
            sum+=root.left.val;
        }
        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);
        return sum;
    }


}
