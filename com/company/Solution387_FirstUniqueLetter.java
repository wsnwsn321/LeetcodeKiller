package com.company;

import java.util.HashMap;
import java.util.Map;

public class Solution387_FirstUniqueLetter {
    public static void main(String[] args) {

    }
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        for (char x:s.toCharArray()){
            count[x-'a']++;
        }
        for (int i=0;i<s.length();++i){
            if (count[s.charAt(i)]==1) return i;
        }
        return -1;
    }
}
