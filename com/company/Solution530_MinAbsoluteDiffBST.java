package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution530_MinAbsoluteDiffBST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    public int getMinimumDifference(TreeNode root) {
        List<Integer> l =new ArrayList<>();
        inOrderTraversal(root,l);
        int min =Integer.MAX_VALUE;
        for(int i=0;i<l.size()-1;++i){
            if(min>l.get(i+1)-l.get(i)){
                min = l.get(i+1)-l.get(i);
            }
        }
        return min;

    }
    public void inOrderTraversal(TreeNode r, List<Integer> l){
        if(r!=null){
            inOrderTraversal(r.left,l);
            l.add(r.val);
            inOrderTraversal(r.right,l);
        }

    }
}
