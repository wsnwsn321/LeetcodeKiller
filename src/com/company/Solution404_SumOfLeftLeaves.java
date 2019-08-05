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
        if(root==null)
            return 0;
        if(root.left!=null&&root.left.left==null&&root.left.right==null){
            sum+=root.val;
        }
        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);
        return sum;
    }
}
