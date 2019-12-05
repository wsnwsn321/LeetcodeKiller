package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution362_DesignHitCounter {
    public static void main(String[] args) {

    }
    class HitCounter {
        PriorityQueue<Integer> pq;
        Map<Integer,Integer> count;
        /** Initialize your data structure here. */
        public HitCounter() {
            pq = new PriorityQueue<>();
            count = new HashMap<>();
        }

        /** Record a hit.
         @param timestamp - The current timestamp (in seconds granularity). */
        public void hit(int timestamp) {
            if (count.containsKey(timestamp))
                count.put(timestamp,count.get(timestamp)+1);
            else {
                pq.offer(timestamp);
                count.put(timestamp,1);
            }
        }

        /** Return the number of hits in the past 5 minutes.
         @param timestamp - The current timestamp (in seconds granularity). */
        public int getHits(int timestamp) {
            while (pq.size()>0&&timestamp-pq.peek()>=300)
                pq.poll();
            int sum=0;
            for (int x:pq){
                sum+=count.get(x);
            }
            return sum;
        }
    }
}
