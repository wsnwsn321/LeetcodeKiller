package com.company;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Solution1170_CompareStringsbyFrequencyoftheSmallestCharacter {
    public static void main(String[] args) {
        String[] q = new String[]{"cbd"};
        String[] w = new String[]{"zaaaz"};
        numSmallerByFrequency(q,w);
    }

    public static int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] res = new int[queries.length];
        int[] countWords = count(words);
        Arrays.sort(countWords);
        int[] q = count(queries);
        for (int i = 0; i < q.length; ++i) {
            int x = q[i];
            int l = 0, r = words.length - 1;
            int ans = -1;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (x >= countWords[mid]) {
                    l = mid + 1;
                } else {
                    ans = mid;
                    r = mid - 1;
                }
            }
            res[i] = ans==-1?0:ans+1;
        }
        return res;
    }

    public static int[] count(String[] words) {
        int[] res = new int[words.length];
        for (int i = 0; i < res.length; ++i) {
            TreeMap<Character, Integer> count = new TreeMap<>();
            for (char ch : words[i].toCharArray())
                count.put(ch, count.getOrDefault(ch, 0) + 1);
            res[i] = count.firstEntry().getValue();
        }
        return res;
    }
}
