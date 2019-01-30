package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution409_LongestPalindrome {
    public static void main(String[] args) {

    }
    public int longestPalindrome(String s) {
        Map<Character,Integer> m = new HashMap<>();
        int count =0,single=0;
        char[] cs = s.toCharArray();
        for(char c:cs){
            m.put(c, m.getOrDefault(c, 0) + 1);
        }
        for ( Map.Entry<Character, Integer> entry : m.entrySet()){
            if(entry.getValue()%2==0) count+=entry.getValue();
            else {
                count+=entry.getValue()-1;
                single =1;
            }
        }
        return count+single;
    }
}
