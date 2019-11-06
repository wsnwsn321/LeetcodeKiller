package com.company;

import java.util.Arrays;

public class Solution455_AssignCookies {
    public static void main(String[] args) {

    }
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ig = 0,is =0;
        int res=0;
        while (is<s.length&&ig<g.length){
            if (s[is]>=g[ig]){
                res++;
                is++;
                ig++;
            }
            else {
                is++;
            }
        }
        return res;
    }
}
