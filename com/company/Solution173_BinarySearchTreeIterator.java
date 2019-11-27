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
        Queue<Integer> q = new LinkedList<>();
        public BSTIterator(TreeNode root) {
            Stack<TreeNode> s = new Stack<>();
            TreeNode cur = root;
            while (cur!=null||s.size()>0){
                while (cur!=null){
                    cur = cur.left;
                    s.push(cur);
                }
                cur = s.pop();
                q.offer(cur.val);
                cur = cur.right;
            }
        }

        /** @return the next smallest number */
        public int next() {
            return q.poll();
        }

        /** @return whether we have a next smallest number */
        public boolean hasNext() {
            return q.size()>0;
        }
    }
}
