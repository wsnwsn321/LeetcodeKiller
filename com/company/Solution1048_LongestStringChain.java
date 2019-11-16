package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution1048_LongestStringChain {
    public static void main(String[] args) {
        String[] w = new String[]{"a","b","ba","bca","bda","bdca"};
        longestStrChain(w);
    }

    //Time O(NlogNS)
    //Space O(NS)
    public static int longestStrChain(String[] words) {
        Map<String, Integer> dp = new HashMap<>();
        Arrays.sort(words, (a, b)->a.length() - b.length());
        int res = 0;
        for (String word : words) {
            int best = 0;
            for (int i = 0; i < word.length(); ++i) {
                String prev = word.substring(0, i) + word.substring(i + 1);
                best = Math.max(best, dp.getOrDefault(prev, 0) + 1);
            }
            dp.put(word, best);
            res = Math.max(res, best);
        }
        return res;
    }
}
