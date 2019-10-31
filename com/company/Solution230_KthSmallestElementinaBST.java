package com.company;

public class Solution230_KthSmallestElementinaBST {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    int count=0;int res=Integer.MAX_VALUE;
    public int kthSmallest(TreeNode root, int k) {
        if (root==null) return 0;
        travel(root,k);
        return res;
    }
    public void travel(TreeNode root, int k){
        if (root==null) return;
        travel(root.left,k);
        count++;
        if (count==k){
            res = root.val;
        }
        travel(root.right,k);
    }
}
