package com.company;

import java.util.Arrays;

public class Solution455_AssignCookies {
    public static void main(String[] args) {

    }
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count =0;
        int i=0, j=0;
        while(i<g.length-1||j<s.length-1){
            if(g[i]<=s[j]){
                count++;
                i++;j++;
            }
            else{
                j++;
            }
        }
        return count;
    }
}
