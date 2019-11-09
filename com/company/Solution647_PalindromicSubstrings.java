package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution647_PalindromicSubstrings {
    public static void main(String[] args) {

    }
    public int countSubstrings(String s) {
        int res = 0;
        for (int i=0;i<s.length();++i){
            int countOdd = countPalindrome(s,i,i);
            int countEven = countPalindrome(s,i,i+1);
            res+=countEven+countOdd;
        }
        return res;

    }



    public int countPalindrome(String s, int left,int right){
        int count=0;
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
            count++;
        }
        return count;
    }
}
