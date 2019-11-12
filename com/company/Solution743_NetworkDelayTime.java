package com.company;

import java.util.*;

class Solution743_NetworkDelayTime {

    public int networkDelayTime(int[][] times, int N, int K) {
        Map<Integer,List<int[]>> map = new HashMap<>();
        for (int[] x:times){
            if (!map.containsKey(x[0]))
                map.put(x[0],new ArrayList<>());
            map.get(x[0]).add(new int[]{x[1],x[2]});
        }
        Map<Integer,Integer> visited = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.offer(new int[]{K,0});
        while (pq.size()>0){
            int[] cur = pq.poll();
            if(visited.containsKey(cur[0])) continue;
            visited.put(cur[0],cur[1]);
            if (map.containsKey(cur[0])){
                for (int[] nodes: map.get(cur[0])){
                    if (!visited.containsKey(nodes[0])){
                        pq.offer(new int[]{nodes[0],cur[1]+nodes[1]});
                    }
                }
            }
        }
        if (visited.size()!=N) return -1;
        int res=0;
        for (int distance:visited.values()){
            res = Math.max(res,distance);
        }
        return res;
    }
}
