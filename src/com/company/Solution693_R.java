package com.company;

import java.math.BigInteger;

public class Solution693_R {
    public static void main(String[] args) {
        int n =5;
        hasAlternatingBits(n);

    }

    public static boolean hasAlternatingBits(int n) {
//        int length = (int)(Math.log(n) / Math.log(2) + 1);
//       int r = n >> 1;
//       int result = n^r;
//       if (result==Math.pow(2,length)-1) return true;
//       else return false;
        n = n ^ (n >> 1);
        return (n & n+1) == 0;

    }
}
