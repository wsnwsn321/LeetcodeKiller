package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution287_FindtheDuplicateNumber {
    public static void main(String[] args) {

    }
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i=1;i<nums.length;++i){
            if (nums[i]==nums[i-1]) return nums[i];
        }
        return 0;
    }
}
