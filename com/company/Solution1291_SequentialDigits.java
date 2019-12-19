package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Solution1291_SequentialDigits {
    public static void main(String[] args) {

    }
    public List<Integer> sequentialDigits(int low, int high) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < 10; ++i)
            q.offer(i);
        while (q.size() > 0) {
            int cur = q.poll();
            if (cur >= low && cur <= high) res.add(cur);
            if (cur % 10 < 9) {
                int next = cur * 10 + (cur % 10 + 1);
                if (next <= high) q.offer(next);
            }
        }
        return res;
    }
}
