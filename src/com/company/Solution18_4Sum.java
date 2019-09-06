package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution18_4Sum {
    public static void main(String[] args) {

    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0;i<nums.length-3;++i){
            if (i!=0&&nums[i]==nums[i-1]) continue;
            int threeSumTarget = target-nums[i];
            for (int j=i+1;j<nums.length-2;++j){
                if(j>i+1&&nums[j]==nums[j-1]) continue;
                int l=j+1,r=nums.length-1;
                while (l<r){
                    if (threeSumTarget==nums[j]+nums[l]+nums[r]){
                        ret.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                        while (l<r&&nums[l]==nums[l+1]) l++;
                        while (l<r&&nums[r]==nums[r-1]) r--;
                        l++;r--;
                    }
                    else if (nums[j]+nums[l]+nums[r]>threeSumTarget){
                        r--;
                    }
                    else {
                        l++;
                    }
                }
            }
        }
        return ret;
    }
}
