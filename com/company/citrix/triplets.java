package com.company.citrix;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class triplets {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};
        List<Integer> aa =new ArrayList<>();
        for (int x:a){
            aa.add(x);
        }
        long t = 8;
        triplet(aa,t);
    }
    public static long triplet(List<Integer> d, long t){
        int[] arr = new int[d.size()];
        for (int i=0;i<d.size();++i){
            arr[i] = d.get(i);
        }
        Arrays.sort(arr);
        long result = 0;
        for (int i=0;i<arr.length-2;++i){
            int l =i+1,r = arr.length-1;
            while (l<r){
                long sum = arr[i]+arr[l]+arr[r];
                if (sum<=t){
                    result+=r-l;
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return result;
    }
}
