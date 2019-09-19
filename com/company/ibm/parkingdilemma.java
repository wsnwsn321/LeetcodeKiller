package com.company.ibm;

import java.util.Arrays;

public class parkingdilemma {
    public static void main(String[] args) {
        int[] arr = new int[]{2,10,8,17};
        carParkingRoof(arr,3);
    }
    public static int carParkingRoof(int[] n, int k){
        int l=0;
        Arrays.sort(n);
        int min=Integer.MAX_VALUE;
        while (l<n.length-k){
            min = Math.min(n[l+k-1]-n[l],min);
            l++;
        }
        return min+1;
    }
}
