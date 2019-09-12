package com.company;

import java.util.*;

public class Solution239_SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,-1,-3,5,3,6,7};
        int k=3;
        maxSlidingWindow(nums,k);
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==0) return new int[]{};
        Queue<Integer> window = new LinkedList();
        PriorityQueue<Integer> p = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        int[] res = new int[nums.length-k+1];
        for (int i=0;i<nums.length;++i){
            if (i<k) {
                window.offer(nums[i]);
                p.add(nums[i]);
                res[0] = p.peek();
            }
            else{
                int head = window.poll();
                p.remove(head);
                window.offer(nums[i]);
                p.add(nums[i]);
                res[i-k+1] = p.peek();
            }

        }
        return res;
    }
}
