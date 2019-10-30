package com.company;

import java.util.Arrays;

public class Solution280_WiggleSort {
    public static void main(String[] args) {

    }
    public void wiggleSort(int[] nums) {
        for (int i=0;i+1<nums.length;++i){
            if (i%2==0){
                if (nums[i]>nums[i+1]){
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                }
            }
            else{
                if (nums[i]<nums[i+1]){
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                }
            }
        }
    }
}
