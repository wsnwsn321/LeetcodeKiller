package com.company;

public class Solution424_LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {

    }
    public int characterReplacement(String s, int k) {
        int l = 0;
        int maxCount = 0, res = 0;
        int[] count = new int[26];
        for (int r = 0; r < s.length(); ++r) {
            count[s.charAt(r) - 'A']++;
            //get the char that appears most inside current window
            maxCount = Math.max(maxCount, count[s.charAt(r) - 'A']);
            //curchange only becomes smaller when maxcound becomes larger
            int curChange = r - l + 1 - maxCount;
            //if maxcount doesn't change, we shift the whole window rightwards
            // by one unit. So that the length is unchanged.
            if (curChange > k) {
                count[s.charAt(l++) - 'A']--;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
