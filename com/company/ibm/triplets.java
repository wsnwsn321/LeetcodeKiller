package com.company.ibm;

import java.util.Arrays;

public class triplets {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5};
        triplets(arr,8);
    }
    public static int triplets(int[] arr,int t){
        Arrays.sort(arr);
        int count=0;
        for (int i=0;i<arr.length-2;++i){
            int l=i+1,r=arr.length-1;
            while(l<r) {
                if (arr[i] + arr[l] + arr[r] <= t) {
                    count+=r-l;
                    l++;
                } else {
                    r--;
                }
            }

        }
        return count;
    }
}
