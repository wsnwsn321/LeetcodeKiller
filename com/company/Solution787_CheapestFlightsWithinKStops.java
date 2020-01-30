package com.company;

import java.util.*;

public class Solution787_CheapestFlightsWithinKStops {
    public static void main(String[] args) {

    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        Map<Integer, List<int[]>> routes = new HashMap<>();
        Set<Integer> visited = new HashSet<>();
        for (int[] f : flights) {
            if (!routes.containsKey(f[0]))
                routes.put(f[0], new ArrayList<>());
            routes.get(f[0]).add(new int[]{f[1], f[2]});
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[1] - b[1]));
        pq.offer(new int[]{src, 0, K + 1});
        visited.add(src);
        while (pq.size() > 0) {
            int[] cur = pq.poll();
            if (cur[0] == dst) {
                return cur[1];
            }
            if (cur[2] > 0) {
                if (!routes.containsKey(cur[0])) continue;
                for (int[] stops : routes.get(cur[0])) {
                    visited.add(stops[0]);
                    pq.offer(new int[]{stops[0], cur[1] + stops[1], cur[2] - 1});
                }
            }
        }
        return -1;
    }
}
