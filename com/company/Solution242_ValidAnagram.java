package com.company;

import java.util.*;

public class Solution242_ValidAnagram {
    public static void main(String[] args) {

    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] count= new int[s.length()];
        for (char ch:s.toCharArray()){
            count[ch-'a']++;
        }
        int length=s.length()-1;
        for (char ch:t.toCharArray()){
            count[ch-'a']--;
            if (count[ch-'a']>=0)
                length--;
        }
        return length==0;
    }
}
