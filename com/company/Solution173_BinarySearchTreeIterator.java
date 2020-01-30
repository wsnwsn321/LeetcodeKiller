package com.company;

import java.util.*;

public class Solution173_BinarySearchTreeIterator {
    public static void main(String[] args) {

    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    class BSTIterator {
        TreeNode cur;
        Stack<TreeNode> s;

        public BSTIterator(TreeNode root) {
            s = new Stack<>();
            cur = root;
        }

        /**
         * @return the next smallest number
         */
        public int next() {
            while (cur != null) {
                s.push(cur);
                cur = cur.left;
            }
            TreeNode next = s.pop();
            cur = next.right;
            return next.val;
        }

        /**
         * @return whether we have a next smallest number
         */
        public boolean hasNext() {
            return cur != null || !s.isEmpty();
        }
    }
}
