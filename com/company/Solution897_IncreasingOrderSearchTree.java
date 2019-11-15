package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution897_IncreasingOrderSearchTree {
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public static void main(String[] args) {

    }

    public static TreeNode increasingBST(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        inorderNums(l,root);
        TreeNode result = new TreeNode(l.get(0));
        TreeNode curr = result;
        for(int i=1;i<l.size();++i){
            curr.left=null;
            curr.right = new TreeNode(l.get(i));
            curr = curr.right;
        }
        return result;
    }

    public static void inorderNums(List<Integer> l,TreeNode root){
        if(root==null) return;
        if(root.left!=null) inorderNums(l,root.left);
        l.add(root.val);
        if(root.right!= null) inorderNums(l,root.right);

    }

}
