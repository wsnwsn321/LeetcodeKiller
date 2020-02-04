package com.company;

import java.util.*;

public class Solution621_TaskScheduler {
    public static void main(String[] args) {
    char[] c = new char[]{'A','A','A','B','B','B'};
    leastInterval(c,2);
    }
    public static int leastInterval(char[] tasks, int n) {
        if (n == 0) return tasks.length;

        Map<Character, Integer> taskToCount = new HashMap<>();
        for (char c : tasks) {
            taskToCount.put(c, taskToCount.getOrDefault(c, 0) + 1);
        }

        Queue<Integer> q = new PriorityQueue<>((i1, i2) -> i2 - i1);
        for (char c : taskToCount.keySet()) q.offer(taskToCount.get(c));
        int time = 0;
        Map<Integer, Integer> cooldown = new HashMap<>();
        while (q.size() > 0 || cooldown.size() > 0) {

            if (cooldown.containsKey(time - n - 1)) {
                q.offer(cooldown.remove(time - n - 1));
            }

            if (q.size() > 0) {
                int remaining = q.poll() - 1;
                if (remaining > 0)
                    cooldown.put(time, remaining);
            }
            time++;
        }
        return time;

    }


}
