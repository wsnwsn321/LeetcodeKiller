package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution3_R {
    public static void main(String[] args) {

        String a = "abcabcbb";
        lengthOfLongestSubstring(a);
    }
    public static int lengthOfLongestSubstring(String s) {
        char[] sc = s.toCharArray();
        if(s.length()==0) return 0;
        int i=0, j=0, max =0;
        Set<Character> st = new HashSet<>();
        while(j<sc.length){
            if(!st.contains(sc[j])){
                st.add(sc[j]);
                j++;
                max = Math.max(st.size(),max);


            }
            else{
                st.remove(sc[i]);
                i++;
            }
        }

        return max;

    }

}
