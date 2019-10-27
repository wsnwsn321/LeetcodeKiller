package com.company.Google;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;

public class SumOfLeafNode {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {
        //contruct binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.left.right = new TreeNode(8);
        System.out.println(solution(root));
    }
    public static int solution(TreeNode root){
        if (root==null) return 0;
        return travel(root);

    }
    public static int travel(TreeNode root){
        if (root==null) return 0;
        if (root.left==null&&root.right==null)  return root.val;
        int left = travel(root.left);
        int right = travel(root.right);
        return left+right;
    }
}
