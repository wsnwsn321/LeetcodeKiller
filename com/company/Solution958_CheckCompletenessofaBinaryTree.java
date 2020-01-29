package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Solution958_CheckCompletenessofaBinaryTree {
    public static void main(String[] args) {

    }
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (q.peek() != null) {
            TreeNode cur = q.poll();
            q.offer(cur.left);
            q.offer(cur.right);
        }
        while (q.size() > 0 && q.peek() == null) {
            q.poll();
        }
        return q.isEmpty();

    }
}
