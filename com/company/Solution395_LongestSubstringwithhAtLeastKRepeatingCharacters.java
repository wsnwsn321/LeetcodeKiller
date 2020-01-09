package com.company;

public class Solution395_LongestSubstringwithhAtLeastKRepeatingCharacters {
    public static void main(String[] args) {
        String x = "aaabb";
        longestSubstring(x,2);
    }
    public static int longestSubstring(String s, int k) {
        int d = 0;

        for (int numUniqueTarget = 1; numUniqueTarget <= 26; numUniqueTarget++)
            d = Math.max(d, longestSubstringWithNUniqueChars(s, k, numUniqueTarget));

        return d;
    }

    private static int longestSubstringWithNUniqueChars(String s, int k, int countUniqueTarget) {
        int[] map = new int[128];
        int countUnique = 0; // counter 1
        int countReachK = 0; // counter 2
        int begin = 0, end = 0;
        int d = 0;

        while (end < s.length()) {
            if (map[s.charAt(end)]++ == 0) countUnique++; // found a unique letter, inc numUnique
            if (map[s.charAt(end++)] == k) countReachK++; // current letter repeated k times, inc numNoLessThanK

            //current unique char is larger than target unique char, decrease number of unique chars
            while (countUnique > countUniqueTarget) {
                if (map[s.charAt(begin)]-- == k) countReachK--; // decrement map[c] after this statement
                if (map[s.charAt(begin++)] == 0) countUnique--; // inc begin after this statement
            }

            // if we found a string where the number of unique chars equals our target
            // and all those chars are repeated at least K times then update max
            if (countUniqueTarget == countReachK )
                d = Math.max(end - begin, d);
        }

        return d;
    }
}
