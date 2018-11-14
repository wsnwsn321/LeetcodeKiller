package com.company;

public class Solution796_RotateString {
    public static void main(String[] args) {
        String A ="abcde";
        String B = "cdeab";
        rotateString(A,B);
    }
    public static boolean rotateString(String A, String B) {
        if(A.length()!=B.length()) return false;
        for(int i=0;i<A.length();++i){
            String temp=A.substring(i)+A.substring(0,i);
            if(temp.equals(B)) return true;
        }
        return false;
    }

}
