package com.company;

import java.util.*;

public class Solution242 {
    public static void main(String[] args) {

    }
    public static boolean isAnagram(String s, String t) {
        int[] s1 = new int[26];
        int[] t1 = new int[26];

        char[] chars = s.toCharArray();
        for(char c: chars){
           if(s1[c-97]==0){
               s1[c-97]=1;
           }
           else{
               s1[c-97]+=1;
            }
        }
        char[] char2 = t.toCharArray();
        for(char c: char2){
            if(t1[c-97]==0){
                t1[c-97]=1;
            }
            else {
                t1[c - 97] += 1;
            }
        }
        return Arrays.equals(s1,t1);
    }
}
