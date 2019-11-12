package com.company;

import java.util.*;

public class Solution787_CheapestFlightsWithinKStops {
    public static void main(String[] args) {

    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        Map<Integer,List<int[]>> map = new HashMap<>();
        for (int[] x:flights){
            if (!map.containsKey(x[0]))
                map.put(x[0],new ArrayList<>());
            map.get(x[0]).add(new int[]{x[1],x[2]});
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        //node (city,cost,stop)
        pq.offer(new int[]{src,0,K+1});
        while (pq.size()>0){
            int[] cur = pq.poll();
            if (cur[0]==dst){
                return cur[1];
            }
            if (cur[2]>0){
                if (map.containsKey(cur[0])){
                    for (int[] nodes: map.get(cur[0])){
                        pq.offer(new int[]{nodes[0],cur[1]+nodes[1],cur[2]-1});
                    }
                }
            }
        }
        return -1;
    }
}
