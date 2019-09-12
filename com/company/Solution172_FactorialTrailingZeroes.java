package com.company;

public class Solution172_FactorialTrailingZeroes {
    public static void main(String[] args) {

    }
        public int trailingZeroes(int n) {
            int r = 0;
            while (n > 0) {
                n /= 5;
                r += n;
            }
            return r;
        }


}
