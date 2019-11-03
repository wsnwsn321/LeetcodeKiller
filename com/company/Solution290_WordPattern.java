package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution290_WordPattern {
    public static void main(String[] args) {

    }
    public boolean wordPattern(String pattern, String str) {
        String[] strs = str.split("\\s+");
        if(pattern.length()!=strs.length) return false;
        Map<Character,String> map = new HashMap<>();
        for (int i=0;i<pattern.length();++i){
            char x = pattern.charAt(i);
            if (!map.containsKey(x)) {
                if(map.containsValue(strs[i])) return false;
                map.put(x,strs[i]);
                continue;
            }
            if (!map.get(x).equals(strs[i]))
                return false;
        }
        return true;
    }
}
