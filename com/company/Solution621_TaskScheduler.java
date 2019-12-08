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

        Queue<Integer> queue = new PriorityQueue<>((i1, i2) -> i2 - i1);
        for (char c : taskToCount.keySet()) queue.offer(taskToCount.get(c));
        //cooldown stores current unavailable tasks
        Map<Integer, Integer> coolDown = new HashMap<>();
        int currTime = 0;
        while (!queue.isEmpty() || !coolDown.isEmpty()) {
            //release tasks in cooldown when time has passed n seconds
            if (coolDown.containsKey(currTime - n - 1)) {
                queue.offer(coolDown.remove(currTime - n - 1));
            }
            if (!queue.isEmpty()) {
                int left = queue.poll() - 1;
                //put remaining tasks into cooldown with the time it's executed
                if (left != 0) coolDown.put(currTime, left);
            }
            currTime++;
        }

        return currTime;
    }


}
