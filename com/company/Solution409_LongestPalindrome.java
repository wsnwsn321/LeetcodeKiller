package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution409_LongestPalindrome {
    public static void main(String[] args) {

    }
    public int longestPalindrome(String s) {
        boolean containOdd=false;
        Map<Character,Integer> map = new HashMap<>();
        for (char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int res =0, maxOdd =0;
        for (Character ch:map.keySet()){
            if (map.get(ch)%2==0)
                res+=map.get(ch);
            else{
                res+=map.get(ch)-1;
                containOdd =true;
            }
        }
        return containOdd?res+1:res;
    }
}
