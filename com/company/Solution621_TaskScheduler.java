package com.company;

import java.util.*;

public class Solution621_TaskScheduler {
    public static void main(String[] args) {
    char[] c = new char[]{'A','A','A','B','B','B'};
    leastInterval(c,2);
    }
    public static int leastInterval(char[] tasks, int n) {
        int res=0;
        Map<Character,Integer> map = new HashMap<>();
        for (char t:tasks){
            map.put(t,map.getOrDefault(t,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for (char t:map.keySet()){
            pq.add(map.get(t));
        }
        while (pq.size()>0){
            int i = 0;
            List < Integer > temp = new ArrayList < > ();
            while (i <= n) {
                if (!pq.isEmpty()) {
                    if (pq.peek() > 1)
                        temp.add(pq.poll() - 1);
                    else
                        pq.poll();
                }
                res++;
                if (pq.isEmpty() && temp.size() == 0)
                    break;
                i++;
            }
            for (int l: temp)
                pq.add(l);
        }
        return res;
    }


}
