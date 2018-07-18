package com.company;

import java.util.ArrayList;

public class Solution500 {
    public static void main(String[] args) {
        String[] a = new String[]{"Hello","Alaska","Dad","Peace"};
        System.out.println(findWords(a));
    }
    public static String[] findWords(String[] words) {
        ArrayList<String> result =new ArrayList<>();
        String[] rows = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
        for(String v:words){
            int i=0,j=0;
            int single =0;
            if (rows[i].indexOf(c) > 0) {
                single =i;
                continue;
            } else {
                i++;
                j=0;
            }
            for(char c: v.toCharArray()) {
                if(i==rows.length) break;
            }
            if(single==i) result.add(v);
        }
        String[] rS = new String[result.size()];
        rS = result.toArray(rS);
        return rS;
    }

}
