package com.company;

public class Solution238_ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int[] x = new int[]{1,2,3,4};
        productExceptSelf(x);
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] leftRight = new int[nums.length];
        int[] rightLeft = new int[nums.length];
        int product=1;
        for (int i=0;i<leftRight.length;++i){
            if (nums[i]!=0){
                product*=nums[i];
                leftRight[i] = product;
            }
            else leftRight[i] = product;
        }
        product=1;
        for (int i=rightLeft.length-1;i>=0;--i){
            if (nums[i]!=0){
                product*=nums[i];
                rightLeft[i] = product;
            }
            else rightLeft[i] = product;
        }
        for (int i=0;i<nums.length;++i){
            if (nums[i]!=0)
                nums[i] = leftRight[i]*rightLeft[i]/(nums[i]*nums[i]);
            else
                nums[i] = leftRight[i]*rightLeft[i];
        }
        return nums;
    }
}
