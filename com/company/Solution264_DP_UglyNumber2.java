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
        int[] dp = new int[n];
        dp[0] = 1;
        int f2=0,f3=0,f5=0;
        for (int i=1;i<dp.length;++i){
            int mul = Math.min(dp[f5]*5,Math.min(dp[f2]*2,dp[f3*3]));
            if (mul==dp[f2]*2) f2++;
            if (mul==dp[f3]*3) f3++;
            if (mul==dp[f5]*5) f5++;
            dp[i] = mul;
        }
        return dp[n-1];
    }

}
