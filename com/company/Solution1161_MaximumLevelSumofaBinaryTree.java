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
        Queue<TreeNode> q =  new LinkedList<>();
        if (root==null) return 0;
        q.offer(root);
        int level =0;
        int res = 0,totalSum=0;
        while (q.size()>0){
            int size= q.size();
            int sum=0;
            level++;
            while (size>0){
                TreeNode cur = q.poll();
                sum+=cur.val;
                if (cur.left!=null) q.offer(cur.left);
                if (cur.right!=null) q.offer(cur.right);
                size--;
            }
            if (sum>totalSum){
                res = level;
                totalSum = sum;
            }
        }
        return res;

    }

}
