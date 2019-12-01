package com.company;

public class Solution151_ReverseWordsinaString {
    public static void main(String[] args) {

    }
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int index = s.length() - 1;
        while (index >= 0) {
            if (s.charAt(index) == ' ') {
                index--;
                continue;
            }
            int start = s.lastIndexOf(' ',index) + 1;
            sb.append(' ');
            sb.append(s.substring(start, index + 1));
            index = start - 1;
        }
        if (sb.length() > 0) sb.deleteCharAt(0);
        return sb.toString();
    }
}
