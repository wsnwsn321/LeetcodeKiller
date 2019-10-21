package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Solution1161_MaximumLevelSumofaBinaryTree {
    public static void main(String[] args) {

    }
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
    public int maxLevelSum(TreeNode root) {
        if (root==null) return 0;
        int res=1;int sum=0;
        int level=1;
        int max = Integer.MIN_VALUE;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (q.size()>0){
            int size=q.size();
            for (int i=0;i<size;++i){
                TreeNode cur = q.poll();
                sum+=cur.val;
                if (cur.left!=null) q.offer(cur.left);
                if (cur.right!=null) q.offer(cur.right);
            }
            if (max<sum){
                max = sum;
                res = level;
            }
            sum=0;level++;

        }
        return res;
    }

}
