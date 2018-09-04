package com.company;

public class Solution700 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public static void main(String[] args) {

    }

    public TreeNode searchBST(TreeNode root, int val) {
      if(root==null) return null;
      if(root.val==val) {
        return root;
      }
      if(root.val<val){
        return searchBST(root.right,val);
      }
      else{
        return searchBST(root.left,val);
      }
  }
}
