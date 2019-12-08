package com.company;

public class Solution340_LongestSubstringwithAtMostKDistinctCharacters {
    public static void main(String[] args) {

    }
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int[] count = new int[128];
        int res=0, uniqueChar=0;
        int l=0;
        for (int i=0;i<s.length();++i){
            char cur = s.charAt(i);
            if (count[cur]++==0) uniqueChar++;
            while (uniqueChar>k&&l<s.length()){
                if (count[s.charAt(l++)]--==1)
                    uniqueChar--;
            }
            res = Math.max(res,i-l+1);
        }
        return res;
    }
}
