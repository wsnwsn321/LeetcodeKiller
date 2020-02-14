package com.company;

import java.util.*;

public class Solution362_DesignHitCounter {
    public static void main(String[] args) {

    }
    class HitCounter {

        Map<Integer, Integer> count;
        Queue<Integer> scale;

        /**
         * Initialize your data structure here.
         */
        public HitCounter() {
            count = new HashMap<>();
            scale = new LinkedList<>();
        }

        /**
         * Record a hit.
         *
         * @param timestamp - The current timestamp (in seconds granularity).
         */
        public void hit(int timestamp) {
            count.put(timestamp, count.getOrDefault(timestamp, 0) + 1);
            scale.offer(timestamp);


        }

        /**
         * Return the number of hits in the past 5 minutes.
         *
         * @param timestamp - The current timestamp (in seconds granularity).
         */
        public int getHits(int timestamp) {
            while (scale.size() > 0 && scale.peek() <= timestamp - 300) {
                count.remove(scale.poll());
            }
            int res = 0;
            for (int times : count.values()) {
                res += times;
            }
            return res;
        }
    }
}
