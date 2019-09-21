package com.company;


import java.util.*;

public class Solution94_BinaryTreeInorderTraversal {
      public class TreeNode {
          int val;
          TreeNode left;
         TreeNode right;
          TreeNode(int x) { val = x; }
      }

    public static void main(String[] args) {

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode cur = root;
        while (cur!=null||!s.isEmpty()){
            while (cur!=null){
                s.push(cur);
                cur = cur.left;
            }
            cur = s.pop();
            res.add(cur.val);
            cur = cur.right;
        }
        return res;
    }


}
