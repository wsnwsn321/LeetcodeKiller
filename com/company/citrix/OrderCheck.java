package com.company.citrix;

import java.util.Arrays;

public class OrderCheck {
    public static void main(String[] args) {
        int[] a = new int[]{1,1,3,3,4,1};
        orderCheck(a);
    }
    public static int orderCheck(int[] arr){
        if (arr.length<1) return arr.length;
            int[] sorted = arr.clone();
        int count=0;
        Arrays.sort(sorted);
        for (int i=0;i<arr.length;++i){
            if (sorted[i]!=arr[i]) count++;
        }
        return count;

    }
}
