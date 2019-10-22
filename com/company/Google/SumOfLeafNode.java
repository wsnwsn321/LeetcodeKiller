package com.company.Google;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;

public class SumOfLeafNode {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    int res=0;
    public int solution(TreeNode root){
        if (root==null) return 0;
        travel(root);
        return res;

    }
    public void travel(TreeNode root){
        if (root==null) return;
        if (root.left==null&&root.right==null)  res+=root.val;
        travel(root.left);
        travel(root.right);
    }
}
