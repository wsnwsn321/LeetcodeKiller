package com.company;

public class Solution938_RangeSumOfBST {
    public static void main(String[] args) {

    }
    int sum=0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root==null) return sum;
        if(root.val<L){
            rangeSumBST(root.right,L,R);
        }
        if(root.val>R){
            rangeSumBST(root.left.L,R);
        }
        sum+=root.val;
        rangeSumBST(root.left,L,R);
        rangeSumBST(root.right,L,R);
        return sum;
    }
}
