package com.company;

import javax.print.DocFlavor;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution557_ReverseWordsinaStringIII {
    public static void main(String[] args) {
    String s = "i love u";
    reverseWords(s);
    }


    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split("\\s+");
        for (String x: words){
            for (int i=x.length()-1;i>=0;--i){
                sb.append(x.charAt(i));
            }
            sb.append(" ");
        }
        return sb.deleteCharAt(sb.length()-1).toString();
    }
}

