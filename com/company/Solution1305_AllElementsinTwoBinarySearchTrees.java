package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution1305_AllElementsinTwoBinarySearchTrees {
    public static void main(String[] args) {

    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        List<Integer> res = new ArrayList<>();
        while (root1 != null || root2 != null || !s1.isEmpty() || !s2.isEmpty()) {
            while (root1 != null) {
                s1.push(root1);
                root1 = root1.left;
            }
            while (root2 != null) {
                s2.push(root2);
                root2 = root2.left;
            }
            int v1 = s1.size()>0?s1.peek().val:Integer.MAX_VALUE;
            int v2 = s2.size()>0?s2.peek().val:Integer.MAX_VALUE;
            if (v1<v2) {
                root1 = s1.pop();
                res.add(root1.val);
                root1 = root1.right;
            } else {
                root2 = s2.pop();
                res.add(root2.val);
                root2 = root2.right;
            }
        }
        return res;
    }
}
