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
        Map<String,List<String>> m = new HashMap<>();
        for (String x:strs){
            char[] cx = x.toCharArray();
            Arrays.sort(cx);//KlogK, where k is the length of longest string
            String key = String.valueOf(cx);
            m.putIfAbsent(key,new ArrayList<>());
            m.get(key).add(x);
        }
        return new ArrayList<>(m.values());
    }
}
