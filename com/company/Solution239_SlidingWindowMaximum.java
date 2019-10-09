package com.company;

import java.util.*;

public class Solution239_SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,-1,-3,5,3,6,7};
        int k=3;
        maxSlidingWindow(nums,k);
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(b-a));
        int[] res = new int[nums.length-k+1];
        for (int i=0;i<nums.length;++i){
            dq.add(nums[i]);
            pq.add(nums[i]);
            if (dq.size()>k) {
                int head = dq.removeFirst();
                pq.remove(head);
            }
            if (i>=k-1) res[i-k+1] = pq.peek();
        }
        return res;
    }
}
