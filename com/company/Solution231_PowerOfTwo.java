package com.company;

public class Solution231_PowerOfTwo {
    public static void main(String[] args) {

    }
    public boolean isPowerOfTwo(int n) {
        while (n%2==0){
            if(n==1) return true;
            n /=2;
        }
        return false;
    }
}
