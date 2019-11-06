package com.company;

import java.util.HashSet;
import java.util.Set;

public class Solution424_LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        characterReplacement(s,1);

    }
    public static int characterReplacement(String s, int k) {
        int l=0,r=0;
        int maxChange =0;
        int maxCount =0;
        int res = 0;
        int[] letters = new int[26];
        while (r<s.length()){
            letters[s.charAt(r)-'A']++;
            maxCount = Math.max(maxChange,letters[s.charAt(r)-'A']);
            maxChange = r-l+1 - maxCount;
            if (maxChange>k){
                letters[s.charAt(l++)-'A']--;
            }
            res = Math.max(res,r-l+1);
            r++;
        }
        return res;
    }
}
