package com.company;

public class Solution669_R {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {

    }
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root==null ) return null;
        if(root.val>=L&&root.val<=R){
            root.left=trimBST(root.left,L,R);
            root.right=trimBST(root.right,L,R);
        }
        else{
            if(root.val>R) return trimBST(root.left,L,R);
            if(root.val<L) return trimBST(root.right,L,R);

        }
        return root;
    }

}
