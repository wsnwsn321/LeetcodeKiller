package com.company;

import java.util.Arrays;

public class Solution792_NumberofMatchingSubsequences {
    public static void main(String[] args) {
        String s = "abcde";
        String[] words = new String[]{"a","bb","acd","ade"};
        numMatchingSubseq(s,words);


    }
    public static int numMatchingSubseq(String S, String[] words) {
        int count = 0;
        for (String w : words) {
            int i = 0;   // word index
            int j = 0;   // S index
            while (j < S.length() && i < w.length()) {
                if (S.charAt(j) == w.charAt(i)) {
                    j ++;
                    i ++;
                } else {
                    j ++;
                }
            }
            if (i == w.length()) count ++;
        }
        return count;
    }
}