package com.company;

import java.util.HashMap;
import java.util.Map;

public class Solution387_FirstUniqueLetter {
    public static void main(String[] args) {

    }
    public int firstUniqChar(String s) {
        for (int i=0;i<s.length();++i){
            if (s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i)))
                return i;
        }
        return -1;
    }
}
