package com.company;

public class Solution917 {
    public static void main(String[] args) {
        String s = "ab-cd";
        String q = reverseOnlyLetters(s);
        q=q+"1";
    }
    public static String reverseOnlyLetters(String S) {
        int start =0, end = S.length()-1;
        char[] cs = S.toCharArray();
        while(start<end){
            char s = cs[start];
            char e = cs[end];
            while(start<end&&!Character.isLetter(cs[start])){
                start++;
                s = cs[start];
            }
            while(start<end&&!Character.isLetter(cs[end])){
                end--;
                e = cs[end];
            }
            char temp = s;
            cs[start] = e;
            cs[end] =temp;
            start++;
            end--;
        }
        return new String(cs);
    }
}
