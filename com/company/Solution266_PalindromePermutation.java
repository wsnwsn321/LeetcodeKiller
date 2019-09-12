package com.company;

import java.util.HashMap;
import java.util.Map;

public class Solution266_PalindromePermutation {
    public static void main(String[] args) {

    }
    public boolean canPermutePalindrome(String s) {
        Map<Character, Integer> m = new HashMap<>();
        int single =0;
        char[] cs = s.toCharArray();
        for(char x: cs){
            m.put(x,m.getOrDefault(x,0)+1);
        }

        for(Map.Entry<Character, Integer> entry: m.entrySet()){
            if(entry.getValue()%2!=0) single++;
            if(single>1) return false;
        }
        return true;
    }
}
