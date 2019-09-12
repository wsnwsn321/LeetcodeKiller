package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution103_BinaryTreeZigzagLevelOrderTraversal {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        travel(res,root,0);
        return res;

    }
    public void travel(List<List<Integer>> res, TreeNode root, int level){
        if(root==null) return;
        if(res.size()<level+1) res.add(new ArrayList<>());
        if(level%2==0)
            res.get(level).add(root.val);
        else
            res.get(level).add(0,root.val);
        travel(res,root.left,level+1);
        travel(res,root.right,level+1);
    }
}
