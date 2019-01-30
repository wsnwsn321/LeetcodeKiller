package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution350_IntersectionOfTwoArrays {
    public static void main(String[] args) {

    }
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> l = new ArrayList<>();
        int i=0,j=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]==nums2[j]){
                l.add(nums1[i]);
                i++;j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int[] result = new int[l.size()];
        int count=0;
        for(int x:l){
            result[count++] = x;
        }
        return result;
    }
}
