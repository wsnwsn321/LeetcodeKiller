package com.company;

import javax.print.DocFlavor;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution557 {
    public static void main(String[] args) {
    String s = "i love u";
    reverseWords(s);
    }


    public static String reverseWords(String s) {
        String[] v = s.split(" ");
        int i=0;
        for (String q: v) {
            StringBuilder newQ = new StringBuilder(q);
            newQ.reverse();
            v[i] = new String(newQ);
            i++;
        }

        return String.join(" ",v);
    }
}

