package com.company;

import java.util.*;

public class Solution49_GroupAnagrams {
    public static void main(String[] args) {
            String[] s = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
         List<List<String>> a =   groupAnagrams(s);
            int q = 1;
    }
    public static List<List<String>> groupAnagrams(String[] strs)
    {
        Map<String, List<String>> m = new HashMap<>();
        for(int i=0;i<strs.length;++i){
            char[] cs = strs[i].toCharArray();
            Arrays.sort(cs);
            if(!m.containsKey(String.valueOf(cs))){
                List<String> t = new ArrayList<>();
                t.add(strs[i]);
                m.put(String.valueOf(cs),t);
            }else{
                List<String> t = m.get(String.valueOf(cs));
                t.add(strs[i]);
                m.put(String.valueOf(cs),t);
            }
        }

        return new ArrayList<>(m.values());

    }
}
