package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution409_LongestPalindrome {
    public static void main(String[] args) {

    }
    public int longestPalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int res = 0;
        int singleCount =0;
        for (char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (char ch:map.keySet()){
            if (map.get(ch)%2==0)
                res+=map.get(ch);
            else{
                singleCount++;
                res+=map.get(ch)-1;
            }
        }
        return singleCount>2?res+1:res;
    }
}
