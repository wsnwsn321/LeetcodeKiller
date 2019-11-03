package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution257_BinaryTreePaths {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    List<String> res = new ArrayList<>();
    //time:     O(n)
    //space:    O(n)
    public List<String> binaryTreePaths(TreeNode root){
        backtrakcing(root,"");
        return res;
    }

    public void backtrakcing(TreeNode root,String path){
        if (root==null) return;
        if (root.left==null&&root.right==null){
            path+=root.val;
            res.add(path);
        }
        backtrakcing(root.left,path+root.val+"->");
        backtrakcing(root.right,path+root.val+"->");
    }
}
