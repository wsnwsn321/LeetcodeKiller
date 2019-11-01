package com.company;

import java.util.Arrays;
import java.util.PriorityQueue;

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
            if (x>max) max = x;
            if (x<min) min = x;
        }
        int[] count = new int[max-min+1];
        int res =0;
        for (int x:nums){
            count[x-min]++;
        }
        int kth=1;
        for (int i=count.length-1;i>=0;--i){
            while (count[i]>0){
                count[i]--;
                kth++;
                if (kth==k) return min+i;
            }
        }
        return 0;
    }
}
