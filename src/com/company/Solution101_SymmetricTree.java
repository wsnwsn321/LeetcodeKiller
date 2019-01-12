package com.company;

public class Solution101_SymmetricTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public static void main(String[] args) {

    }
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }

    public boolean isMirror(TreeNode t1, TreeNode t2) {
        //both are leaves
        if(t1==null&&t2==null) return true;
        //one is leaf and one is not
        if(t1==null||t2==null) return false;
        if(t1.val==t2.val){
            return isMirror(t1.left,t2.right)&&isMirror(t1.right,t2.left);
        }
        else{
            return false;
        }
    }
}
