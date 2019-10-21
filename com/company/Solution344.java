package com.company;

public class Solution344 {
    public static void main(String[] args) {
        String s = "hello";

    }
    public void reverseString(char[] s) {
        for (int i=0;i<s.length/2;++i){
            char temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] =temp;
        }

    }
}
