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
        Deque<Integer> dq = new LinkedList<>();
        int index=0;
        int[] res = new int[a.length-k+1];
        for (int i=0;i<a.length;++i){
            if (dq.size()>0&&dq.peek()<i-k+1)
                dq.pollFirst();
            //remove all smaller number before ith position to keep the head of dq with the largest number
            while (dq.size()>0&&a[i]>a[dq.peekLast()])
                dq.pollLast();

            dq.offer(i);
            if (i>=k-1){
                res[index++] = a[dq.peekFirst()];
            }
        }
        return res;
    }
}
