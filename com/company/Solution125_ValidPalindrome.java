package com.company;

public class Solution125_ValidPalindrome {
    public boolean isPalindrome(String s) {
        return isP(s,0,s.length()-1);
    }

    public boolean isP(String s,int left,int right){
        while(left<right&&s.charAt(left)==s.charAt(right)){
            left++;
            right--;
        }
        return left>=right;
    }
}
