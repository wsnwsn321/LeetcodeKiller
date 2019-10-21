package com.company;

import java.util.*;

public class Solution621_TaskScheduler {
    public static void main(String[] args) {
    char[] c = new char[]{'A','A','A','B','B','B'};
    leastInterval(c,2);
    }
    public static int leastInterval(char[] tasks, int n) {
        int[] map = new int[26];
        int distinctTask=0;
        for (char c: tasks)
            map[c - 'A']++;
        PriorityQueue< Integer > queue = new PriorityQueue<>((a,b)->map[b]-map[a]);
        for (int i=0;i<map.length;++i) {
            if (map[i] > 0) {
                queue.add(i);
                distinctTask++;
            }
        }
        List<Integer> schedule = new ArrayList<>();
        while (distinctTask>0){
            int curCount=0;
            for (int task:queue){
                if (map[task]>0){
                    schedule.add(task);
                    map[task]--;
                    if (map[task]==0) distinctTask--;
                    curCount++;
                }
            }
            while (distinctTask>0&&curCount<=n){
                schedule.add(-1);
                curCount++;
            }
        }
        return schedule.size();

    }


}
