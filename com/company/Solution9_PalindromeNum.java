package com.company;

public class Solution9_PalindromeNum {
    public static void main(String[] args) {
        int x=121;
        isPalindrome(x);


    }
    //time: O(log10(n))
    //space: O(1)
    public static boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) return false;
        int secondHalf=0;
        while (secondHalf<x){
            int digit = x%10;
            secondHalf = secondHalf*10+digit;
            x/=10;
        }
        return x==secondHalf||x==secondHalf/10;
    }
}
