package com.company;

import java.util.*;

class Solution743_NetworkDelayTime {

    public int networkDelayTime(int[][] times, int N, int K) {
        Map<Integer, List<int[]>> map = new HashMap<>();
        for (int[] x : times) {
            if (!map.containsKey(x[0]))
                map.put(x[0], new ArrayList<>());
            map.get(x[0]).add(new int[]{x[1], x[2]});
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        int[] visited = new int[N];
        Arrays.fill(visited, Integer.MAX_VALUE);
        int max = 0;
        pq.offer(new int[]{K, 0});
        while (pq.size() > 0) {
            int[] cur = pq.poll();
            if (visited[cur[0]] != Integer.MAX_VALUE) continue;
            visited[cur[0]] = cur[1];
            max = Math.max(max, visited[cur[0]]);
            if (!map.containsKey(cur[0])) continue;
            for (int[] next : map.get(cur[0])) {
                if (visited[next[0]] != Integer.MAX_VALUE) continue;
                pq.offer(new int[]{next[0], next[1] + cur[1]});
            }
        }
        for (int i=1;i<visited.length;++i)
            if (visited[i]==Integer.MAX_VALUE) return -1;
        return max;
    }
}
