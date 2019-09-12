package com.company;

public class Solution108_ConvertSortedArrayToBST {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {

    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int start =0, end = nums.length-1;
        if(nums.length==0) return null;
        TreeNode t =constructBST(nums,start,end);
        return t;
    }
    public TreeNode constructBST(int[] nums,int start,int end){
        if(start>end) return null;
        int mid = start+(end-start)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = constructBST(nums, start, mid - 1);
        node.right = constructBST(nums, mid + 1, end);
        return node;
    }
}
