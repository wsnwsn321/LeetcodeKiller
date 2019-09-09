package com.company;

import java.util.*;

public class Solution15_3Sum {
    public static void main(String[] args) {

        int[] a = new int[]{2,4,3,-3,-2,-2,1,0,0,3,0,-2,-1,1,2,-3};
        threeSum(a);
     }
     //time:    O(n^2)
    //space: O(n)
    public static List<List<Integer>> threeSum(int[] num) {
        if (num.length<2) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(num);
        for (int i=0;i<num.length-2;++i){
            if (i!=0&&num[i]==num[i-1]) continue;
            int target = 0- num[i];
            int l=i+1,r=num.length-1;
            while (l<r){
                if (num[l]+num[r]==target){
                    res.add(Arrays.asList(num[i],num[l],num[r]));
                    while (l<r&&num[l]==num[l+1])l++;
                    while (l<r&&num[r]==num[r-1])r--;
                    l++;r--;
                }
                else if (num[l]+num[r]<target){
                    l++;
                }
                else {
                    r--;
                }
            }
        }
        return res;
    }

}
