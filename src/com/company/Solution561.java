package com.company;


import java.util.Arrays;

public class Solution561 {
    public static void main(String[] args) {

    }
    public  static int arrayPairSum(int[] nums) {
        int sumOfMin =0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length/2;i++){
            sumOfMin+=nums[2*i];
        }
        return  sumOfMin;
    }
}
