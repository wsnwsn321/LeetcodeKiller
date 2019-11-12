package com.company;

import java.util.Stack;

public class Solution783_MinDistanceInBST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    public int minDiffInBST(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        TreeNode cur = root;
        TreeNode prev = null;
        int res =Integer.MAX_VALUE;
        while (cur!=null||s.size()>0){
            while (cur!=null){
                s.push(cur);
                cur = cur.left;
            }
            cur = s.pop();
            if (prev!=null){
                res = Math.min(res,cur.val-prev.val);
            }
            prev = cur;
            cur = cur.right;
        }
        return res;
    }

}
