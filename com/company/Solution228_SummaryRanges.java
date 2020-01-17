package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution228_SummaryRanges {
    public static void main(String[] args) {

    }
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums.length==0) return res;
        int i=0;
        while (i<nums.length){
            int start = i;
            while (i+1<nums.length&&nums[i+1]==nums[i]+1){
                i++;
            }
            if (start==i)
                res.add(String.valueOf(nums[i]));
            else {
                String temp = nums[start]+"->"+(nums[start]+(i-start));
                res.add(temp);
            }
            i++;
        }
        return res;
    }
}
