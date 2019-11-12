package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution740_DeleteandEarn {
    public static void main(String[] args) {

    }
    public int deleteAndEarn(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b*map.get(b)-a*map.get(a));
        for (int key:map.keySet()){
            pq.add(key);
        }
        int res=0;
        while (pq.size()>0){
            int cur = pq.poll();
            res+=cur*map.get(cur);
            if (pq.contains(cur+1))
                pq.remove(cur+1);
            if (pq.contains(cur-1))
                pq.remove(cur-1);
        }
        return res;

    }
}
