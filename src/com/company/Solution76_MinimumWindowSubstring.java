package com.company;

public class Solution76_MinimumWindowSubstring {
    public static void main(String[] args) {

    }
    public String minWindow(String s, String t) {
        if (s.length()==0) return "";
        int[] count = new int[26];
        for (char x:t.toCharArray()){
            count[x-'a']++;
        }
        int min = Integer.MAX_VALUE;
        int fl=0,fr=0;
        int l=0;
        for (int r=0;r<s.length();++r){
            while (l<r&&StringContains(s.substring(l,r+1),count)){
                min = Math.min(min,r-l+1);
                fl=l;fr=r;
                l++;
            }
        }
        return s.substring(fl,fr+1);

    }

    public boolean StringContains(String s, int[] count){
        int[] scount= new int[26];
        for (char c: ct){
            if (s.indexOf(c)==-1) return false;
        }
        return true;
    }
}
