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
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List<String>> ans = new HashMap<>();
        int[] count = new int[26];
        for (String s : strs) {
            Arrays.fill(count, 0);
            for (char ch : s.toCharArray())
                count[ch - 'a']++;
            StringBuilder sb = new StringBuilder();
            for (int x : count)
                sb.append(x);
            if (!ans.containsKey(sb.toString()))
                ans.put(sb.toString(), new ArrayList<>());
            ans.get(sb.toString()).add(s);
        }
        return new ArrayList(ans.values());
    }
}
