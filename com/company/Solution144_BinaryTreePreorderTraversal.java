package com.company;

import java.util.*;

public class Solution144_BinaryTreePreorderTraversal {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res= new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while (s.size()>0){
            TreeNode cur = s.pop();
            res.add(cur.val);
            if (cur.right!=null)
                s.push(cur.right);
            if (cur.left!=null)
                s.push(cur.left);
        }
        return res;
    }
}
