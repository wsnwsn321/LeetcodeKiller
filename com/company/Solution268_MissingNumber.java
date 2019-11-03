package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution268_MissingNumber {
    public static void main(String[] args) {

    }
    public int missingNumber(int[] nums) {
        int total = (0+nums.length)*(nums.length+1)/2;
        int curSum=0;
        for(int x:nums){
            curSum+=x;
        }
        return total-curSum;
    }
}
