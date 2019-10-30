package com.company;

import java.util.*;

public class Solution136_SingleNumber {
    public static void main(String[] args) {
    int[] n = new int[]{2,1,2};
    int k = 5^3;
    singleNumber(n);
    }

    public static int singleNumber(int[] nums) {
        int res=0;
        for (int x:nums){
            res = res^x;
        }
        return res;
    }
}
