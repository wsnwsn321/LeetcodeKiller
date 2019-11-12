package com.company;

public class Solution424_LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {

    }
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int start=0,end=0;
        int maxLength=0;
        int maxCount=0;
        char[] cs = s.toCharArray();
        while (end<s.length()){
            maxCount = Math.max(maxCount,++count[cs[end]-'A']);
            if (end-start+1-maxCount>k){
                count[cs[start]-'A']--;
                start++;
            }
            maxLength = Math.max(maxLength,end-start+1);
            end++;
        }
        return maxLength;
    }
}
