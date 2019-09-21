package com.company.ibm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class MeanderingArray {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{3,5,-2,1,7};
        meanderingSort(arr);
    }
    public static int[] meanderingSort(Integer[] arr){
        Arrays.sort(arr,Collections.reverseOrder());
        int[] res = new int[arr.length];
        int j=0,i=0;
        while(j<arr.length-1){
            res[j++] = arr[i];
            res[j++] = arr[arr.length-1-i];
            i++;
        }
        if (arr.length%2==1) res[j]=arr[i];
        return res;
    }
}
