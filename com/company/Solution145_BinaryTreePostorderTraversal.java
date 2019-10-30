package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.TreeMap;

public class Solution145_BinaryTreePostorderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<Integer>();
        if(root==null) return res;
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while(!s.empty()) {
            TreeNode cur = s.pop();
            res.add(0,cur.val);
            if (cur.left!=null)
                s.push(cur.left);
            if (cur.right!=null)
                s.push(cur.right);
        }
        return res;

    }
}
