package com.company;

public class Solution100_SameTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null&&q==null) return true;
        if((p==null&&q!=null)||(q==null&&p!=null)) return false;
        return p.val==q.val&&
                isSameTree(p.left,q.left)&&
                isSameTree(p.right,q.right);
    }
}
