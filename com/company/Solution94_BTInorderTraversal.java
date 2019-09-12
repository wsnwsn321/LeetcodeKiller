package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution94_BTInorderTraversal {
    public class TreeNode {
        int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> s= new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            while(root.left!=null){
                s.push(root.left);
                root=root.left;
            }
            TreeNode temp = s.pop();
            res.add(temp.val);
            if(temp.right!=null)
                s.add(temp.right);
        }
        return res;
    }
}
