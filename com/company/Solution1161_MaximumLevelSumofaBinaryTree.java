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
        int res = 1;
        int max_sum=0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 1;
        while (q.size()>0){
            int size = q.size();
            int sum=0;
            for (int i=0;i<size;++i){
                TreeNode cur = q.poll();
                sum+=cur.val;
                if (cur.left!=null)
                    q.offer(cur.left);
                if (cur.right!=null)
                    q.offer(cur.right);
            }
            if (max_sum<sum){
                res = level;
                max_sum = sum;
            }
            level++;
        }
        return res;
    }

}
