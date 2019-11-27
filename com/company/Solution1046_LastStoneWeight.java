package com.company;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution1046_LastStoneWeight {
    public static void main(String[] args) {

    }
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for (int x:stones)
            pq.offer(x);
        while (pq.size()>1){
            int s1 = pq.poll();
            int s2 = pq.poll();
            if (s1!=s2)
                pq.offer(s1-s2);
        }
        return pq.peek();
    }
}
