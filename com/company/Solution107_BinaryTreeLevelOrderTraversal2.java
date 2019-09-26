package com.company;

import java.util.*;

public class Solution107_BinaryTreeLevelOrderTraversal2 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
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
        Collections.reverse(res);
        return res;
    }


}
