package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution264_DP_UglyNumber2 {
    public static void main(String[] args) {

        int n =20;
        nthUglyNumber(n);
    }

    public static int nthUglyNumber(int n) {
        int[] r = new int[n];
        int f2 =2,f3 =3,f5=5;
        int i2=1,i3=1,i5=1;
        r[0]=1;
        for(int i=1;i<n;++i){
            int min = Math.min(Math.min(f2,f3),f5);
            r[i] = min;
            if(f2 == min)
                f2 = 2*r[i2++];
            if(f3 == min)
                f3 = 3*r[i3++];
            if(f5 == min)
                f5 = 5*r[i5++];
        }
        return r[n-1];

    }

}
