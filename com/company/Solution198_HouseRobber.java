package com.company;

public class Solution198_HouseRobber {
    public static void main(String[] args) {

    }

    public int rob(int[] nums) {
        int res = 0;
        int preSum=0,curSum=0;
        for (int i=0;i<nums.length;++i){
            int temp = curSum;
            curSum = Math.max(preSum+nums[i],preSum);
            preSum = temp;
            res =Math.max(res,curSum);
        }
        return res;
    }
}
