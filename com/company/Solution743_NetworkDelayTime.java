package com.company;

import java.util.*;

class Solution {
    Map<Integer, Integer> dist;
    public int networkDelayTime(int[][] times, int N, int K) {
        Map<Integer, List<int[]>> neighbour = new HashMap<>();
        for(int i=0;i<times.length;++i){
            int[] route = times[i];
            if(!neighbour.containsKey(route[0]))
                neighbour.put(route[0],new ArrayList<>());
            neighbour.get(route[0]).add(new int[]{route[1],route[2]});
        }
        Set<Integer> visited = new HashSet<>();
        dist = new HashMap();
        for (int node = 1; node <= N; ++node)
            dist.put(node, Integer.MAX_VALUE);
        dfs(K,neighbour, 0);
        int ans =0;
        for (int cand: dist.values()) {
            if (cand == Integer.MAX_VALUE) return -1;
            ans = Math.max(ans, cand);
        }
        return ans;

    }
    public void dfs(int startNode,Map<Integer,List<int[]>> m,int time){
        if(time>=dist.get(startNode)) return;
        dist.put(startNode,time);
        if(!m.containsKey(startNode)) return;
        List<int[]> n = m.get(startNode);
        for(int i=0;i<n.size();++i){
            int nextNode =n.get(i)[0];
            dfs(nextNode,m,time+n.get(i)[1]);
        }
    }
}
