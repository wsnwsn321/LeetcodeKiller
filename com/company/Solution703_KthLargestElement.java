package com.company;

import java.util.*;

public class Solution703_KthLargestElement {
    public static void main(String[] args) {
    }
    class KthLargest {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int k;
        public KthLargest(int k, int[] nums) {
         this.k=k;
         for (int x:nums) add(x);
        }

        public int add(int val) {
            pq.offer(val);
            if (pq.size()>k)
                pq.poll();
            return pq.peek();
        }
    }
}
