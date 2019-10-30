package com.company;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution215_KthLargestElement {
    public static void main(String[] args) {

    }
    //time:     O(nlogk)
    //space:    O(k)
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int x:nums){
            pq.add(x);
            if (pq.size()>k){
                pq.poll();
            }
        }

        return pq.peek();


    }
}
