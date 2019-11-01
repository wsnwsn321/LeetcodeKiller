package com.company;

import java.util.*;

public class Solution239_SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,-1,-3,5,3,6,7};
        int k=3;
        maxSlidingWindow(nums,k);
    }
    public static int[] maxSlidingWindow(int[] a, int k) {
        if (a == null || k <= 0) {
            return new int[0];
        }
        int r=0;
        int index=0;
        int[] res = new int[a.length-k+1];
        Deque<Integer> dq = new LinkedList<>();

        while (r<a.length) {
            if (dq.size() > 0 && dq.peek() < r - k + 1)
                dq.pollFirst();
            while (dq.size() > 0 && a[dq.peekLast()] < a[r])
                dq.pollLast();
            dq.offer(r);
            if (r >= k - 1) {
                res[index++] = a[dq.peek()];
            }
            r++;
        }
        return res;
    }
}
