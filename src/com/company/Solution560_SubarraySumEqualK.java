package com.company;

public class Solution560_SubarraySumEqualK {
    static int count;
    public static void main(String[] args) {
        int[] x = new int[]{1,2,3,4,5};
        int re= subarraySum(x, 3);
        int q = re;
    }
    public static  int subarraySum(int[] nums, int k) {
            int ret =0;
            for(int i=0;i<nums.length;++i){
                DFS(nums,k,i,0);
            }
            return count;
    }

    public  static void DFS(int[] nums, int k, int i,int sum){
        if(sum==k){
            count+=1;
            return;
        }
        if(i==nums.length){
            return;
        }
        DFS(nums,k,i+1,sum+nums[i]);
    }
}
