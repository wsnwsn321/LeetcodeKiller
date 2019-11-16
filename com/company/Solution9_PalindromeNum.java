package com.company;

public class Solution9_PalindromeNum {
    public static void main(String[] args) {
        int x=121;
        isPalindrome(x);


    }
    //time: O(log10(n))
    //space: O(1)
    public static boolean isPalindrome(int x) {
        if (x<0) return false;
        int temp =x;
        int palindrome =0;
        while (temp>0){
            palindrome = 10*palindrome+temp%10;
            temp/=10;
        }
        return palindrome==x;
    }
}
