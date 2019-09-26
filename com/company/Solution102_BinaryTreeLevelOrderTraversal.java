package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
        // List<List<Integer>> res = new ArrayList<>();
        // travel(res,0,root);
        // return res;
        Queue<TreeNode> q= new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        q.offer(root);
        int level=0;
        while (!q.isEmpty()){
            res.add(new ArrayList<>());
            int size = q.size();
            for (int i=0;i<size;++i){
                TreeNode cur = q.poll();
                res.get(level).add(cur.val);
                if (cur.left!=null) q.offer(cur.left);
                if (cur.right!=null) q.offer(cur.right);
            }
            level++;
        }
        return res;

    }
    public void travel(List<List<Integer>> res, int level,TreeNode root){
        if(root==null) return;
        if (res.size()<=level) res.add(new ArrayList<>());
        res.get(level).add(root.val);
        travel(res,level+1,root.left);
        travel(res,level+1,root.right);
    }


}
