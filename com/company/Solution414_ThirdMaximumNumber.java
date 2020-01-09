package com.company;

import java.util.PriorityQueue;

public class Solution414_ThirdMaximumNumber {
    public static void main(String[] args) {

    }
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : nums) {
            if (!pq.contains(i)) {
                pq.offer(i);
                if (pq.size() > 3) {
                    pq.poll();
                }
            }
        }
        if (pq.size() < 3) {
            while (pq.size() > 1) {
                pq.poll();
            }
        }
        return pq.peek();
    }
}
