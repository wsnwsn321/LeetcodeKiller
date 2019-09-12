package com.company;

public class Solution171 {
    public static void main(String[] args) {

        String a = "ZY";
        titleToNumber(a);
    }

    public static int titleToNumber(String s) {
        int result=0;
        char[] news = s.toCharArray();
        for(int i=s.length()-1;i>-1;--i){
            char current = news[i];
            result += (current-64)*Math.pow(26,news.length-1-i);
        }
        return result;
    }
}
