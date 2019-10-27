package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution113_PathSumII {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public static void main(String[] args) {

    }
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        dfs(root,sum,new ArrayList<>());
        return res;
    }
    public void dfs(TreeNode root, int sum, List<Integer> path){
        if (root ==null) return;
        path.add(root.val);
        if (root.left==null&&root.right==null){
            if (sum-root.val==0)
                res.add(new ArrayList<>(path));
        }
        dfs(root.left,sum-root.val,path);
        dfs(root.right,sum-root.val,path);
        path.remove(path.size()-1);

    }

}
