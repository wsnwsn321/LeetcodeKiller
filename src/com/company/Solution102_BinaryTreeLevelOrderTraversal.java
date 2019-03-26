package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution102_BinaryTreeLevelOrderTraversal {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public static void main(String[] args) {


    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        travel(res,root,0);
        return res;
    }

    public void travel(List<List<Integer>> res, TreeNode root, int level){
        if(root==null) return;
        if(res.size()<level+1) res.add(new ArrayList<>());
        travel(res,root.left,level+1);
        res.get(level).add(root.val);
        travel(res,root.right,level+1);
    }

    public List<Integer> inorder(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        travelInOrder(res,root);
        return res;
    }

    public void travelInOrder(List<Integer> res, TreeNode root){
        if(root==null) return;
        travelInOrder(res,root.left);
        res.add(root.val);
        travelInOrder(res,root.right);
    }
}
