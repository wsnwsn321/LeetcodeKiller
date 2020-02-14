package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Solution272_ClosestBinarySearchTreeValueII {
    public static void main(String[] args) {

    }
    public List<Integer> closestKValues(TreeNode root, double target, int k) {
        List<Integer> res = new ArrayList<>();
        PriorityQueue<TreeNode> pq = new PriorityQueue<TreeNode>(new Comparator<TreeNode>() {
            @Override
            public int compare(TreeNode o1, TreeNode o2) {
                double d1 = Math.abs(o1.val-target);
                double d2 = Math.abs(o2.val-target);
                if (d2<d1) return -1;
                if (d2>d1) return 1;
                return 0;
            }
        });
        travel(root, pq, k, target);
        while (pq.size() > 0) {
            res.add(pq.poll().val);
        }
        return res;
    }
    public void travel(TreeNode root, PriorityQueue<TreeNode> pq, int k,double target) {
        if (root == null)
            return;
        travel(root.left, pq, k, target);
        if (pq.size() > 0 && Math.abs(root.val - target) > Math.abs(pq.peek().val - target)) return;
        pq.offer(root);
        if (pq.size() > k)
            pq.poll();
        travel(root.right, pq, k, target);
    }

}
