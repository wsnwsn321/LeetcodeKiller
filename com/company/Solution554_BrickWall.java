package com.company;

import java.util.*;

public class Solution554_BrickWall {
    public static void main(String[] args) {

    }
    public int leastBricks(List<List<Integer>> wall) {
        List<List<Integer>> sums = new ArrayList<>();
        Map<Integer, Integer> freq = new HashMap<>();
        int res = wall.size();
        for (List<Integer> x : wall) {
            int rowSum = 0;
            for (int i = 0; i < x.size() - 1; ++i) {
                rowSum += x.get(i);
                freq.put(rowSum, freq.getOrDefault(rowSum, 0) + 1);
            }
        }
        for (int key : freq.keySet())
            res = Math.min(res, wall.size() - freq.get(key));
        return res;
    }
}
