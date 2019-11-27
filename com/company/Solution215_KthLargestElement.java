package com.company;

import java.util.*;

public class Solution215_KthLargestElement {
    public static void main(String[] args) {
        int[] x = new int[]{3,2,3,1,2,4,5,5,6};
        findKthLargest(x,2);
    }
    //time:     O(nlogk)
    //space:    O(k)
    public static int findKthLargest(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int x:nums){
            max = Math.max(max,x);
            min = Math.min(min,x);
        }
        int[] range = new int[max-min+1];
        for (int x:nums){
            range[x-min]++;
        }
        for (int i=range.length-1;i>=0;--i){
            while (range[i]>0){
                k--;
                range[i]--;
                if (k==0)
                    return min+i;
            }
        }
        return 0;

    }
}
