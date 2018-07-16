package com.company;

import java.util.ArrayList;

public class Solution500 {
    public static void main(String[] args) {
        String[] a = new String[]{"Hello","Alaska","Dad","Peace"};
        System.out.println(findWords(a));
    }
    public static String[] findWords(String[] words) {
        ArrayList<String> result =new ArrayList<>();
        boolean inRow = true;
        String[] rows = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
        for(String v:words){
            int i=0;
           for(char c:v.toCharArray()) {
               if (rows[i].indexOf(c) > 0) {
                   continue;
               } else {
                   i++;
               }
               if (i == rows.length) {
                   inRow = false;
                   break;
               }
           }
            if(inRow) result.add(v);
           inRow = true;
        }
        String[] rS = new String[result.size()];
        rS = result.toArray(rS);
        return rS;
    }

}
