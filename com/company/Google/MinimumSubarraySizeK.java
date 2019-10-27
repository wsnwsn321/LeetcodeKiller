package com.company.Google;

public class MinimumSubarraySizeK {
    public static void main(String[] args) {
        int[] a = new int[]{2,5,-5,9,-7,4};
        withWeight(a,3,new int[]{1,2,3});
    }
    public static int solution(int[] nums, int k){
        int curSum =0;
        int res=Integer.MAX_VALUE;
        for (int i=0;i<k;++i){
            curSum+=nums[i];
        }
        res = curSum;
        int l=1;
        while (l+k-1<nums.length) {
            curSum = curSum + (nums[l+k-1] - nums[l - 1]);
            res = Math.min(res, curSum);
            l++;
        }
        return res;
    }

    public static int withWeight(int[] nums, int k,int[] weight){
        int start = nums.length-k;
        int curSum=0;
        int res=0;
        for (int i=start;i<nums.length;++i){
            for (int j=i;j<i+k;++j){
                curSum+=nums[j%nums.length]*weight[j-i];
            }
            res = Math.max(res,curSum);
        }
        return res;
    }

}
