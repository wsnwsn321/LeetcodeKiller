package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution268_MissingNumber {
    public static void main(String[] args) {

    }
    public int missingNumber(int[] nums) {
        int arraySum =0;
        for(int x:nums){
            arraySum+= x;
        }
        int realSum = (0+nums.length)*(nums.length+1)/2;
        return realSum-arraySum;
    }
}
