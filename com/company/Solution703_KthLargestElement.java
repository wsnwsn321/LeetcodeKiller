package com.company;

import java.util.*;

public class Solution703_KthLargestElement {
    public static void main(String[] args) {
        int k =2;
        int[] nums = new int[]{4,5,8,2};
        KthLargest obj = new KthLargest(k, nums);
        int param_1 = obj.add(3);
    }
    static class KthLargest {
        final PriorityQueue<Integer> q;
        final int k;

        public KthLargest(int k, int[] a) {
            this.k = k;
            q = new PriorityQueue<>(k);
            for (int n : a)
                add(n);
        }

        public int add(int n) {
            if (q.size() < k)
                q.offer(n);
            else if (q.peek() < n) {
                q.poll();
                q.offer(n);
            }
            return q.peek();
        }
    }
}
