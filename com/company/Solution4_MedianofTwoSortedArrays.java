package com.company;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution4_MedianofTwoSortedArrays {
    public static void main(String[] args) {
        int[] n1 = {1};
        int[] n2 = {3,4};

    }
    public double findMedianSortedArrays(int input1[], int input2[]) {
        if (input1.length>input2.length){
            return findMedianSortedArrays(input2,input1);
        }
        int length1 = input1.length;
        int length2 = input2.length;
        int l=0,r = length1;
        while (l<=r){
            int partition1 = l+(r-l)/2;
            int partition2 = (length1+length2+1)/2-partition1;

            int xMaxleft = partition1==0?Integer.MIN_VALUE:input1[partition1-1];
            int xMinRight = partition1==length1?Integer.MAX_VALUE:input1[partition1];

            int yMaxleft = partition2==0?Integer.MIN_VALUE:input2[partition2-1];
            int yMinRight = partition2==length2?Integer.MAX_VALUE:input2[partition2];

            if (xMaxleft<=yMinRight&&yMaxleft<=xMinRight){
                if ((length1+length2)%2==0){
                    return (double)(Math.max(xMaxleft,yMaxleft)+Math.min(xMinRight,yMinRight))/2;
                }
                else
                    return Math.max(xMaxleft,yMaxleft);
            }
            else if (xMaxleft>yMinRight){
                r = partition1-1;
            }
            else {
                l = partition1+1;
            }
        }
        return -1;
    }
}
