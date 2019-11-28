package com.company;

import java.util.*;

public class Solution49_GroupAnagrams {
    public static void main(String[] args) {
            String[] s = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
         List<List<String>> a =   groupAnagrams(s);
            int q = 1;
    }
    //time:     O(nKlogK)
    //space:    O(nK)
    public static List<List<String>> groupAnagrams(String[] strs)
    {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        int[] count = new int[26];
        for (String s : strs) {
            Arrays.fill(count, 0);
            for (char c : s.toCharArray()) count[c - 'a']++;

            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < 26; i++) {
                sb.append(count[i]);
            }
            String key = sb.toString();
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
}
