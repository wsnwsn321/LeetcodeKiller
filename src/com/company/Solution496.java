package com.company;

public class Solution496 {
    public static void main(String[] args) {
        int[] n1 = new int[]{4,1,2};
        int[] n2 = new int[]{1,3,4,2};
        int[] result = nextGreaterElement(n1,n2);
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for(int i=0;i<nums1.length;++i){
            result[i]=findNextNum(nums2,nums1[i]);
        }
        return result;
    }

    public static int findNextNum(int[] num, int n){
        int count=0;
        while(num[count]!=n){
            count++;
        }
        while(count<num.length){
            if(num[count]>n) return num[count];
            count++;
        }
        return -1;
    }
}
