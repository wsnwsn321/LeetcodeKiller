package com.company;

public class Solution283_R {
    public static void main(String[] args) {

    }

    public void moveZeroes(int[] nums) {
        int newPos =0;
        for(int num: nums){
            if(num!=0){
                nums[newPos++]=num;
            }
        }
        while(newPos<nums.length){
            nums[newPos++]=0;
        }
    }
}
