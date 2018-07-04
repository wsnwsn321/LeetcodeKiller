package com.company;

import java.util.ArrayList;

public class Solution852 {
    public static void main(String[] args) {

    }
    public static int peakIndexInMountainArray(int[] A) {
        int breakPoint = 0;
        for(int i=0;i<A.length;i++){
            if(A[i]>A[i+1]){
                breakPoint=i;
                break;
            }
        }
        return breakPoint;
    }
}
