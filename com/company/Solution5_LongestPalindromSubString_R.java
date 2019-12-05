package com.company;

import java.util.ArrayList;

public class Solution5_LongestPalindromSubString_R {
    public static int lo,maxLen;
    public static void main(String[] args) {
        String s = "abacd";
        longestPalindrome(s);

    }
    //time: O(n^2);
    //space: O(n^2);
    public static String longestPalindrome(String s) {
        if(s.length()==0) return "";
        boolean[][] dp = new boolean[s.length()][s.length()];
        int fl=0,fr =0;
        for (int i=0;i<s.length();++i){
            dp[i][i] =true;
            for (int j=i-1;j>=0;--j){
                if (s.charAt(j)==s.charAt(i)){
                    if (j==i-1)
                        dp[j][i]=true;
                    else {
                        dp[j][i] = dp[j+1][i-1];
                    }
                    if (dp[j][i]&&(fr-fl)<(i-j)){
                        fr = i;
                        fl = j;
                    }
                }
            }
        }
        return s.substring(fl,fr+1);
    }
}
