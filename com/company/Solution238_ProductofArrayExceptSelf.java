package com.company;

public class Solution238_ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int[] x = new int[]{1,2,3,4};
        productExceptSelf(x);
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] leftRight = new int[nums.length];
        int[] rightLeft = new int[nums.length];
        leftRight[0]=1;
        for (int i=1;i<leftRight.length;++i){
            leftRight[i] = nums[i - 1] * leftRight[i - 1];
        }
        rightLeft[nums.length-1]=1;
        for (int i=rightLeft.length-2;i>=0;--i){
            rightLeft[i] = nums[i + 1] * rightLeft[i +1];
        }
        for (int i=0;i<nums.length;++i){
            nums[i] = leftRight[i]*rightLeft[i];
        }
        return nums;
    }
}
