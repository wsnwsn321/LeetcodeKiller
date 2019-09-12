package com.company;

import java.util.HashSet;

public class Solution653_R {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    public boolean findTarget(TreeNode root, int k) {
        if(k==root.val) return true;
        HashSet<Integer> h  = new HashSet<>();
        return hashSetHelper(h,root,k);


    }

    public boolean hashSetHelper(HashSet<Integer> h, TreeNode root, int k){
        if(root==null) return false;
        if(h.contains(k-root.val)) return true;
        h.add(root.val);
        return hashSetHelper(h,root.left,k)||hashSetHelper(h,root.right,k);
    }
}
