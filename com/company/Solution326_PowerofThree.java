package com.company;

public class Solution326_PowerofThree {
    public static void main(String[] args) {

    }
    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
}
