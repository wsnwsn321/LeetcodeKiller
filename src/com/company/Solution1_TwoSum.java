package com.company;

import java.util.*;

public class Solution1_TwoSum {
    public static void main(String[] args) {
        int[] a = new int[]{2,3,5,6 ,7,10, 11,12,13,14, 15};
        int[] res = twoSum(a,17);
        int q=1;
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<nums.length;++i){
            if(m.containsKey(target-nums[i])){
                return new int[]{i,m.get(target-nums[i])};
            }
            else{
                m.put(nums[i],i);
            }
        }
        return new int[]{};

    }
}
