package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution403_FrogJump {
    public static void main(String[] args) {

    }
    public boolean canCross(int[] stones) {
        Map<Integer, Set<Integer>> dp = new HashMap<>();
        for (int x:stones)
            dp.put(x,new HashSet<>());
        dp.get(0).add(1);
        for (int s:stones){
            for (int k:dp.get(s)){
                for (int step=k-1;step<=k+1;++step){
                    if (step>0&&dp.containsKey(s+step))
                        dp.get(s+step).add(step);
                }
            }
        }
        return dp.get(stones[stones.length-1]).size()>0?true:false;
    }
}
