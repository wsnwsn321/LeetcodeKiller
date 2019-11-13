package com.company;

import java.util.TreeMap;

public class Solution821 {
    public static void main(String[] args) {
    String a = "loveleetcode";
    shortestToChar2(a,'e');
    }
    public int[] shortestToChar(String S, char C) {
        int N = S.length();
        int[] ans = new int[N];
        int prev = Integer.MIN_VALUE;

        for (int i = 0; i < N; ++i) {
            if (S.charAt(i) == C) prev = i;
            ans[i] = i - prev;
        }

        prev = Integer.MAX_VALUE;
        for (int i = N-1; i >= 0; --i) {
            if (S.charAt(i) == C) prev = i;
            ans[i] = Math.min(ans[i], prev - i);
        }

        return ans;
    }
    public static int[] shortestToChar2(String S, char C) {
        TreeMap<Integer,Character> map = new TreeMap<>();
        for (int i=0;i<S.length();++i){
            if (S.charAt(i)==C)
                map.put(i,C);
        }
        int[] res = new int[S.length()];
        for (int i=0;i<S.length();++i){
            if (S.charAt(i)==C)
                res[i] = 0;
            else {
                int lower = map.lowerKey(i).equals(null)?Integer.MAX_VALUE:map.lowerKey(i);
                int higher = map.higherKey(i).equals(null)?Integer.MAX_VALUE:map.higherKey(i);
                res[i] = Math.min(Math.abs(lower-i),Math.abs(higher-i));
            }
        }
        return res;
    }
}
