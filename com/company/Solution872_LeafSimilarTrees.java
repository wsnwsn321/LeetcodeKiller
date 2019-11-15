package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution872_LeafSimilarTrees {
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
        //leafSimilar(a,b);
    }

    public  boolean leafSimilar(TreeNode root1, TreeNode root2){
        List<Integer> res1 = new ArrayList<>();
        List<Integer> res2 = new ArrayList<>();
        getLeaves(root1,res1);
        getLeaves(root2,res2);
        return res1.equals(res2);

    }

    public void getLeaves(TreeNode root ,List<Integer> res){
        if (root==null) return;
        if (root.left==null&&root.right==null){
            res.add(root.val);
        }
        getLeaves(root.left,res);
        getLeaves(root.right,res);
    }


}
