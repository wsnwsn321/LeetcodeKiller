package com.company;

import java.util.Arrays;

public class Solution875_KokoEatingBananas {
    public static void main(String[] args) {

    }
    public int minEatingSpeed(int[] piles, int H) {
        int l=0,r = getMax(piles);
        while (l<=r){
            int mid = l+(r-l)/2;
            //current mid can be used as k, go left part to see if there's a smaller one
            if (countK(piles,mid)<=H){
                r=mid-1;
            }
            else
                l = mid+1;
        }
        return l;
    }

    public int getMax(int[] piles){
        int max =0;
        for (int x:piles)
            max = Math.max(max,x);
        return max;
    }

    public int countK(int[] piles, int k){
        int count =0;
        for (int x:piles){
            count+=x%k==0?x/k:x/k+1;
        }
        return count;
    }
}
