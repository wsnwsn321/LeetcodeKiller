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
        if (!set.contains(root.val))
            res.add(root);
        travel(root,set);
        return res;
    }
    public TreeNode travel(TreeNode root, Set<Integer> set) {
        if (root == null) return null;
        root.left = travel(root.left, set);
        root.right = travel(root.right, set);
        if (set.contains(root.val)) {
            if (root.left != null) {
                res.add(root.left);
            }
            if (root.right != null) {
                res.add(root.right);
            }
            return null;
        }
        return root;
    }
}
