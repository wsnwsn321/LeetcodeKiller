package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution1110_DeleteNodesAndReturnForest {
    public static void main(String[] args) {

    }
    List<TreeNode> res = new ArrayList<>();
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        if (root==null) return res;
        Set<Integer> set = new HashSet<>();
        for (int x: to_delete) set.add(x);
        travel(root,set);
        if (!set.contains(root.val)) res.add(root);
        return res;
    }
    public TreeNode travel(TreeNode root, Set<Integer> set) {
        if (root == null) return null;
        if (set.contains(root.val)) {
            if (root.left != null) {
                res.add(root.left);
            }
            if (root.right != null) {
                res.add(root.right);
            }
            return null;
        }
        travel(root.left, set);
        travel(root.right, set);
        return root;
    }
}
