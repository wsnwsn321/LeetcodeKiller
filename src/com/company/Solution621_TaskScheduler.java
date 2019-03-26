package com.company;

import java.util.*;

public class Solution621_TaskScheduler {
    public static void main(String[] args) {
    char[] c = new char[]{'A','A','A','B','B','B'};
    leastInterval(c,2);
    }
    public static int leastInterval(char[] tasks, int n) {
        int[] map = new int[26];
        for (char c: tasks)
            map[c - 'A']++;
        PriorityQueue< Integer > queue = new PriorityQueue < > (26, Collections.reverseOrder());
        for (int f: map) {
            if (f > 0)
                queue.add(f);
        }
        List<Integer> schedule = new ArrayList<>();
        int size= queue.size();

        return 1;

    }


}
