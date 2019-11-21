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

    //time:     O(n) number of nodes
    //space:    O(n)
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }
    public boolean isMirror(TreeNode r1,TreeNode r2){
        if (r1==null&&r2==null) return true;
        if ((r1==null&&r2!=null)||(r1!=null&&r2==null)) return false;
        return r1.val==r2.val&&isMirror(r1.left,r2.right)&&isMirror(r1.right,r2.left);
    }


}
