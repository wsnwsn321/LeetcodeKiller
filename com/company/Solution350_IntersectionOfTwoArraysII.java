package com.company;

import java.util.*;

public class Solution350_IntersectionOfTwoArraysII {
    public static void main(String[] args) {

    }
    //time:     O(m+n)
    //space:    O(min(m,n))
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> res = new ArrayList<>();
        int i1 =0,i2=0;
        while (i1<nums1.length&&i2<nums2.length){
            int n1 = nums1[i1];
            int n2 = nums2[i2];
            while (n1==n2){
                res.add(n1);
                n1 = nums1[i1++];
                n2 = nums2[i2++];
            }
            if (n1<n2)
                i1++;
            else i2++;
        }
        int[] resList = new int[res.size()];
        int index=0;
        for (int x:res)
            resList[index++] = x;
        return resList;

    }
}
