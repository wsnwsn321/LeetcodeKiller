package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution366_FindLeavesofBinaryTree {
    public static void main(String[] args) {

    }
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        heightToNode(root);
        return res;
    }

    public int heightToNode(TreeNode root){
        if (root==null) return -1;
        int height = 1+Math.max(heightToNode(root.left),heightToNode(root.right));
        if (res.size()<height+1)
            res.add(new ArrayList<>());
        res.get(height).add(root.val);
        return height;
    }
}
