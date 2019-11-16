package com.company;

public class Solution41_FirstMissingPositive {
    public static void main(String[] args) {

    }
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int contains = 0;
        for (int i = 0; i < n; i++)
            if (nums[i] == 1) {
                contains++;
                break;
            }
        if (contains == 0)
            return 1;
        if (n == 1)
            return 2;
        //filter out of range numbers
        for (int i = 0; i < n; i++){
            if ((nums[i] <= 0) || (nums[i] > n))
                nums[i] = 1;
        }
        for (int i=0;i<n;++i){
            int index = Math.abs(nums[i]);
            if (index==n)
                nums[0] = -n;
            if (nums[index]>0)
                nums[index] = -nums[index];
        }
        for (int i=0;i<n;++i){
            if (nums[i]>0)
                return i;
        }
        return n+1;

    }
}
