package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution16_3SumClosest {
    public static void main(String[] args) {

        int[] n = new int[]{-1,2,1};
        threeSumClosest(n,1);
    }
    //time: O(n^2)
    //space: O(1)
    public static int threeSumClosest(int[] num, int target) {
        Arrays.sort(num);
        int diff = Integer.MAX_VALUE;
        int ans=0;
        for (int i=0;i<num.length-2;++i){
            int t = target-num[i];
            int l=i+1,r =num.length-1;
            while (l<r){
                int sum =num[i]+num[l]+num[r];
                if (Math.abs(sum-target)<diff){
                    diff = Math.abs(sum-target);
                    ans =sum;
                }
                if (sum>target){
                    r--;
                }
                else l++;
            }
        }
        return ans;
    }

}
