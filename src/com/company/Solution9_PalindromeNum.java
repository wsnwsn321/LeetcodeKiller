package com.company;

public class Solution9_PalindromeNum {
    public static void main(String[] args) {
        int x=121;
        isPalindrome(x);


    }
    public static boolean isPalindrome(int x) {
        int reverse=0;
        int temp =x;
        if(x<0) return false;
        if(x>-1&&x<10) return true;
        while(temp>0){
            int digit = String.valueOf(temp).length();
            reverse+=(int)((temp%10)*Math.pow(10,digit-1));
            temp/=10;
        }
        return x==reverse;

    }
}
