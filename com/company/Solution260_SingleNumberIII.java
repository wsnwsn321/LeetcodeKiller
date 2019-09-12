package com.company;

import java.util.*;

public class Solution260_SingleNumberIII {
    public static void main(String[] args) {
        int[] n = new int[]{1,2,1,3,2,5};
        singleNumber(n);
    }
    public static int[] singleNumber(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        Set<Integer> temp = new HashSet<>();
        for (int x:nums){
            temp.add(x);
        }
        for (int i=0;i<nums.length;++i){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
            if (m.get(nums[i])==2) temp.remove(nums[i]);
        }
        int[] ret = new int[temp.size()];
        List<Integer> temp2 = new ArrayList<>(temp);
        for (int i=0;i<temp2.size();++i){
            ret[i] =temp2.get(i);
        }
        return ret;
    }
}
