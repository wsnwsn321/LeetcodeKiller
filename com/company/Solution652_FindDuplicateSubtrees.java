package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution652_FindDuplicateSubtrees {
    public static void main(String[] args) {

    }

    Map<String, Integer> count = new HashMap<>();
    List<TreeNode> res = new ArrayList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        travel(root);
        return res;
    }

    public String travel(TreeNode root) {
        if (root == null) {
            return "#";
        }
        String path = root.val + "," + travel(root.left) + travel(root.right);
        count.put(path, count.getOrDefault(path, 0) + 1);
        if (count.get(path) == 2)
            res.add(root);
        return path;
    }
}
