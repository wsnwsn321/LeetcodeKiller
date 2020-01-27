package com.company;

import java.util.Stack;

public class Solution230_KthSmallestElementinaBST {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    int count=0;int res=Integer.MAX_VALUE;
    public int kthSmallest(TreeNode root, int k) {
        if (root == null) return 0;
        Stack<TreeNode> s = new Stack<>();
        TreeNode cur = root;
        while (s.size() > 0 || cur != null) {
            while (cur != null) {
                s.push(cur);
                cur = cur.left;
            }
            cur = s.pop();
            if (k == 1)
                return cur.val;
            else
                k--;
            cur = cur.right;
        }
        return -1;
    }
}
