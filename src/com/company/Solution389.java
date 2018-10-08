package com.company;

import java.util.ArrayList;

public class Solution389 {
    public static void main(String[] args) {

        String s = "abc";
        String t = "aebc";
        System.out.println(findTheDifference(s,t));
    }
    public static char findTheDifference(String s, String t) {
        int totalS = 0;
        int totalT=0;

        for(int i=0;i<s.length();++i){
            totalS+=(int)s.charAt(i);
        }
        for(int j=0;j<t.length();++j){
            totalT+=(int)t.charAt(j);
        }
        return (char)(totalT-totalS);

    }
}
