package com.company;

import java.util.Arrays;

public class Solution628_MaximumProductOfThreeNumber {
    public static void main(String[] args) {

    }
    public int maximumProduct(int[] nums) {
        int result =0;
        Arrays.sort(nums);
        result=Math.max(nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3],
                    nums[nums.length-1]*nums[0]*nums[1]);
        return result;
    }
}
