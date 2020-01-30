package com.company;

import java.util.TreeMap;

public class Solution821_ShortestDistancetoaCharacter {
    public static void main(String[] args) {
    String a = "loveleetcode";
    }
    public int[] shortestToChar(String S, char C) {
        int before = Integer.MAX_VALUE;
        int behind = Integer.MAX_VALUE;
        int[] res = new int[S.length()];
        for (int i = 0; i < S.length(); ++i) {
            if (S.charAt(i) == C)
                before = i;
            res[i] = before == Integer.MAX_VALUE ? before : i - before;
        }
        for (int i = S.length() - 1; i >= 0; --i) {
            if (S.charAt(i) == C)
                behind = i;
            res[i] = Math.min(res[i], behind == Integer.MAX_VALUE ? behind : behind - i);
        }
        return res;
    }

}
