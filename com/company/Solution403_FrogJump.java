package com.company;

import java.util.*;

public class Solution403_FrogJump {
    public static void main(String[] args) {

    }

    public boolean canCross(int[] stones) {
        Map<Integer, HashSet<Integer>> dp = new HashMap<>();
        for (int x : stones)
            dp.put(x, new HashSet<>());
        dp.get(0).add(0);
        for (int s : stones) {
            for (int step : dp.get(s)) {
                for (int i = step - 1; i <= step + 1; ++i) {
                    if (i > 0 && dp.containsKey(s + i)) {
                        dp.get(s + i).add(i);
                    }
                }
            }
        }
        return dp.get(stones[stones.length - 1]).size() > 0 ? true : false;
    }
}
