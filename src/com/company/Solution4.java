package com.company;

import java.util.Arrays;

public class Solution4 {
    public static void main(String[] args) {
        int[] n1 = {1};
        int[] n2 = {3,4};
        findMedianSortedArrays(n1,n2);

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0;
        double mid1=0,mid2=0;
        int length1=nums1.length/2, length2=nums2.length/2;
        if(nums1.length==0){
            if(nums2.length%2!=0){
                return nums2[nums2.length/2];
            }
            else{
               return (nums2[nums2.length/2-1]+nums2[nums2.length/2])/2.0;
            }
        }
        if(nums2.length==0){
            if(nums1.length%2!=0){
                return nums1[nums1.length/2];
            }
            else{
                return (nums1[nums1.length/2-1]+nums1[nums1.length/2])/2.0;
            }
        }

        if(nums1.length==1&&nums2.length==1) return (nums1[0]+nums2[0])/2.0;
        if(nums1.length%2!=0){
            mid1 = nums1[nums1.length/2];
            length1+=1;
        }
        else{
            mid1 = (nums1[nums1.length/2-1]+nums1[nums1.length/2])/2.0;

        }
        if(nums2.length%2!=0){
            mid2 = nums2[nums2.length/2];
            length2+=1;
        }
        else{
            mid2 = (nums2[nums2.length/2-1]+nums2[nums2.length/2])/2.0;
        }
        if(mid1==mid2) return mid1;
        if(mid1<mid2){
            return findMedianSortedArrays(Arrays.copyOfRange(nums1, 0, length1),
                    Arrays.copyOfRange(nums2, length2,nums2.length));
        }
        else{
            return findMedianSortedArrays(Arrays.copyOfRange(nums1, length1,nums1.length),
                    Arrays.copyOfRange(nums2,0, length2));
        }

    }
}
