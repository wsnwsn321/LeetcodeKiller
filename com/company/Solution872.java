package com.company;

import java.util.ArrayList;

public class Solution872 {
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
    TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
    a.left=b;
    a.right=null;
        b.left=null;
        b.right=null;
        leafSimilar(a,b);
    }

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> first = new ArrayList<>();
        first = getLeaves(root1,first);
        ArrayList<Integer> second = new ArrayList<>();
        second = getLeaves(root2,second);
        if(first.equals(second)) return true;
        else return false;
    }

    public static ArrayList<Integer> getLeaves(TreeNode a, ArrayList<Integer> b){
        if(a == null) {
            return b;
        }
        if(a.left==null&&a.right==null){
            b.add(a.val);
            return b;
        }
        b = getLeaves(a.left,b);
        b = getLeaves(a.right,b);


        return b;
    }

}
