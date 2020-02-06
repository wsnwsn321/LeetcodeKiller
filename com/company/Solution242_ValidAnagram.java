package com.company;

import java.util.*;

public class Solution242_ValidAnagram {
    public static void main(String[] args) {

    }
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] letters = new int[26];
        for (char ch : s.toCharArray()) {
            letters[ch - 'a']++;
        }
        int length = s.length();
        for (char ch : t.toCharArray()) {
            if (letters[ch - 'a']-- >= 1)
                length--;
        }
        return length == 0;
    }
}
