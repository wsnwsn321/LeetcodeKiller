package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

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
        Stack<TreeNode> s = new Stack<TreeNode>();
        s.push(root);
        while(!s.empty()) {
            TreeNode visiting = s.pop();
            res.add(0,visiting.val);
            if(visiting.left!=null) s.push(visiting.left);
            if(visiting.right!=null) s.push(visiting.right);
        }
        return res;

    }
}
