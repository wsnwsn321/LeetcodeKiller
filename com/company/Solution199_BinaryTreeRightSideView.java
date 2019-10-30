package com.company;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution199_BinaryTreeRightSideView {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    public List<Integer> rightSideView(TreeNode root) {
       Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        queue.offer(root);
        res.add(root.val);
       while (queue.size()>0){
           int size = queue.size();
           while (size>0){
               TreeNode cur = queue.poll();
               if (cur.left!=null)
                   queue.offer(cur.left);
               if (cur.right!=null)
                   queue.offer(cur.right);
               size--;
               if (size==0) res.add(cur.val);
           }
       }
       return res;
    }



}
