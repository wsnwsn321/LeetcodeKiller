package com.company.CompanyList;

public class Solution340_LongestSubstringwithAtMostKDistinctCharacters {
    public static void main(String[] args) {

    }
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int[] count = new int[256];
        int num = 0, i = 0, res = 0;
        for (int j = 0; j < s.length(); j++) {
            if (count[s.charAt(j)]++ == 0) num++;
            while (num > k && i < s.length()) {     // sliding window
                count[s.charAt(i)]--;
                if (count[s.charAt(i)] == 0){
                    num--;
                }
                i++;
            }
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}
