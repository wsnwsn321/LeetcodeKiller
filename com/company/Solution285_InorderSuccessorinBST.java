package com.company;

import java.util.*;

public class Solution285_InorderSuccessorinBST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (root==null) return null;
        Stack<TreeNode> s = new Stack<>();
        TreeNode cur = root;
        int val = 0;
        while (cur!=null||s.size()>0){
            while (cur!=null){
                s.push(cur);
                cur=cur.left;
            }
            cur = s.pop();
            if (val==p.val) return cur;
            val = cur.val;
            cur = cur.right;

        }
        return null;

    }

}
