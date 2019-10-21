package com.company;

public class Solution395_LongestSubstringwithhAtLeastKRepeatingCharacters {
    public static void main(String[] args) {
        String x = "abcdedghijklmnopqrstuvwxyz";
        longestSubstring(x,2);
    }
    public static int longestSubstring(String s, int k) {
        int[] count = new int[26];
        boolean flag =true;
        int max =0;
        for (char x:s.toCharArray()){
            count[x-'a']++;
        }
        for (int i=0;i<s.length();++i){
            if (count[s.charAt(i)-'a']<k){
                flag =false;
            }
        }
        if (flag) return s.length();
        int l=0,r=0;
        int result = 0;
        while (r<s.length()){
            if (count[s.charAt(r)-'a']<k){
                result = Math.max(result,longestSubstring(s.substring(l,r),k));
                l=r+1;
            }
            r++;
        }
        result = Math.max(result, longestSubstring(s.substring(l), k));


        return result;

    }
}
