package com.company;

import java.util.HashMap;
import java.util.Map;

public class Solution167_TwoSum_II {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] numbers, int target) {
        int l =0;
        int r = numbers.length-1;
        int[] result = new int[2];
        while(l<r){
            int sum = numbers[l]+numbers[r];
            if(sum==target) {
                result[0] =l+1;
                result[1] =r+1;
                return result;
            }
            else if(sum>target){
                r--;
            }
            else{
                l++;
            }
        }
        return result;
    }
}
