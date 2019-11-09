package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution653_TwoSumIVInputisaBST {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> nums = new HashSet<>();

        return travel(root,nums,k);
    }
    public boolean travel(TreeNode root, Set<Integer> set, int k){
        if (root==null) return false;
        if(set.contains(k-root.val))
            return true;
        set.add(root.val);
        return travel(root.left,set,k) || travel(root.right,set,k);
    }

}
