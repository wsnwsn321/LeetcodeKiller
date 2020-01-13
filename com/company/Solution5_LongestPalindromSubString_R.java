package com.company;

import java.util.ArrayList;

public class Solution5_LongestPalindromSubString_R {
    public static int lo,maxLen;
    public static void main(String[] args) {
        String s = "abacd";
        //longestPalindrome(s);

    }
    //time: O(n^2);
    //space: O(1);
    public  String longestPalindrome(String s) {
        if(s.length()==0) return "";
        int start=0,end=0;
        for (int i=0;i<s.length();++i){
            int l1 = expandAroundCenter(s,i,i);
            int l2 = expandAroundCenter(s,i,i+1);
            int len = Math.max(l1, l2);
            //position i break the palindrom at the middle, so to get its left/right end points by using length/2
            //l2 is just having two same chars at the middle, like abba
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start,end+1);
    }

    public int expandAroundCenter(String s, int l, int r){
        while (l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l+1;
    }
}
