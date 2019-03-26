package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution3_LongestSubstringWithoutRepeatingChar_R {
    public static void main(String[] args) {

        String a = "abcabcbb";
        lengthOfLongestSubstring(a);
    }
    public static int lengthOfLongestSubstring(String s) {
        char[] cs = s.toCharArray();
        Set<Character> list = new HashSet<>();
        int l=0,r=0,max =0;
        while(r<cs.length){
            if(!list.contains(cs[r])){
                list.add(cs[r++]);
                max = Math.max(max,list.size());
            }
            else{
                list.remove(cs[l++]);
            }
        }
        return max;

    }

}
