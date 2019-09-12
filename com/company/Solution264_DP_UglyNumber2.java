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
        int i2 =0,i3=0,i5=0;
        r[0] =1;
        for (int i=1;i<n;++i){
            r[i] = Math.min(r[i2]*2,Math.min(r[i3]*3,r[i5]*5));
            if (r[i]%2==0) i2++;
            if (r[i]%3==0) i3++;
            if (r[i]%5==0) i5++;
        }
        return r[n-1];

    }

}
