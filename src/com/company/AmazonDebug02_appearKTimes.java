package com.company;

import java.util.Arrays;

public class AmazonDebug02_appearKTimes {
    public static void main(String[] args) {
        int a[] = new int[]{};
        appearsKtimes(a,2);
    }
    static int appearsKtimes(int a[], int k){
        Arrays.sort(a);
        if(a.length==0) return -1;
        int i=1,count=1;
        int element =a[0];
        int res = -1;
        while(i<a.length){
            if(element==a[i]) count++;
            else {
                if(count==k) res =element;
                element=a[i];
                count=1;
            }
            i++;
        }
        if(count==k) res=element;
        return res;
    }
}
