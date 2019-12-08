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
        Stack<TreeNode> s;
        TreeNode cur;
        public BSTIterator(TreeNode root) {
            s = new Stack<>();
            TreeNode cur = root;
            while (cur != null) {
                s.push(cur);
                cur = cur.left;
            }
        }

        /** @return the next smallest number */
        public int next() {
            TreeNode node = s.pop();
            TreeNode cur = node.right;
            while (cur!=null){
                s.push(cur);
                cur = cur.left;
            }
            return node.val;

        }

        /** @return whether we have a next smallest number */
        public boolean hasNext() {
            return s.isEmpty();
        }
    }
}
