package com.company;

public class Solution344 {
    public static void main(String[] args) {
        String s = "hello";
        reverseString(s);

    }
    public static String reverseString(String s) {
        if(s.length()<=1) return s;
        char[] cs = s.toCharArray();
        for(int i=0;i<s.length()/2;++i){
            char temp = cs[i];
            cs[i] = cs[cs.length-1-i];
            cs[cs.length-1-i] = temp;
        }
        String result = new String(cs);
        return result;
    }
}
