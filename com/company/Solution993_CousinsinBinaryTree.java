package com.company;

import java.util.*;

public class Solution993_CousinsinBinaryTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public static void main(String[] args) {

    }
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Set<Integer> nodes = new HashSet<>();
            int size =q.size();
            while (size>0){
                TreeNode cur = q.poll();
                if (cur.left != null && cur.right != null) {
                    if (cur.left.val == x && cur.right.val == y) {
                        return false;
                    }
                    if (cur.left.val == y && cur.right.val == x) {
                        return false;
                    }
                }
                if (cur.left!=null) {
                    q.add(cur.left);
                    nodes.add(cur.left.val);
                }
                if (cur.right!=null) {
                    q.add(cur.right);
                    nodes.add(cur.right.val);
                }
                size--;
            }
            if (nodes.contains(x)&&nodes.contains(y)) return true;
        }
        return false;
    }

}
