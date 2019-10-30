package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        List<Integer> sorted;
        int index;
        public BSTIterator(TreeNode root) {
            sorted = new ArrayList<>();
            inorderTraversal(root);
            index=0;

        }
        public void inorderTraversal(TreeNode root){
            inorderTraversal(root.left);
            sorted.add(root.val);
            inorderTraversal(root.right);
        }

        /** @return the next smallest number */
        public int next() {
            return sorted.get(index++);

        }

        /** @return whether we have a next smallest number */
        public boolean hasNext() {
            return index<sorted.size();
        }
    }
}
