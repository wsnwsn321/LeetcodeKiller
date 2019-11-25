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
            //current index is out of bound, remove it from deque
            if (dq.size() > 0 && dq.peek() < r - k + 1)
                dq.pollFirst();
            //remove all elements that is smaller than the current one since they will never be the max one
            while (dq.size() > 0 && a[dq.peekLast()] < a[r])
                dq.pollLast();
            //after the while, all elements smaller than a[r] are popped
            //so the head of the deque will always be the largest element
            dq.offer(r);
            if (r >= k - 1) {
                res[index++] = a[dq.peek()];
            }
            r++;
        }
        return res;
    }
}
