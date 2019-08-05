package com.company;

import java.util.*;

public class Solution15_3Sum {
    public static void main(String[] args) {

        int[] a = new int[]{2,4,3,-3,-2,-2,1,0,0,3,0,-2,-1,1,2,-3};
        threeSum(a);
     }

    public static List<List<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<num.length-2;++i){
            if(num[i+1]==num[i]) continue;
            int l = i+1,r=num.length-1;
            while(l<r){
                if(num[l]+num[r]==0-num[i]){
                    res.add(Arrays.asList(num[i],num[l],num[r]));
                    while(l<r&&num[l]==num[l+1]) l++;
                    while(l<r&&num[r]==num[r-1]) r--;
                    l++;r--;
                }
                else if(num[l]+num[r]>0-num[i]){
                    r--;
                }
                else{
                    l++;
                }

            }
        }
        return res;
    }

}
