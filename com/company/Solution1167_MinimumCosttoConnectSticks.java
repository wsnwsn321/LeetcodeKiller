package com.company;

import java.util.PriorityQueue;

public class Solution1167_MinimumCosttoConnectSticks {
    public static void main(String[] args) {

    }
    public int connectSticks(int[] sticks) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int x:sticks)
            pq.offer(x);
        int cost =0;
        while (pq.size()>1){
            int n1 = pq.poll();
            int n2 = pq.poll();
            cost+=n1+n2;
            pq.offer(n1+n2);
        }
        return cost;
    }
}
