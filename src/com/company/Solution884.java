package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Solution884 {
    public static void main(String[] args) {
        String a ="fv kisxg hfmeq fw gi fpyc ojtr s hfmeq ojtr kisxg";
        String b = "chpi hfmeq chpi dq hwtxa orql orql m s fw dq m fw";
        String[] r = uncommonFromSentences(a,b);

    }
    public static String[] uncommonFromSentences(String A, String B) {
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> a = new ArrayList<>();
        a = seperator(A);
        ArrayList<String> b = new ArrayList<>();
        b = seperator(B);
        for(String word:a){
            if(!b.contains(word)&&Collections.frequency(a, word)==1){
                result.add(word);
            }
        }
        for(String word:b){
            if(!a.contains(word)&&Collections.frequency(b, word)==1){
                result.add(word);
            }
        }


        String[] r = result.toArray(new String[result.size()]);
        return r;


    }

    public static ArrayList<String> seperator(String a){
        ArrayList<String> dup = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        int space = a.indexOf(" ");
        int start = 0;
        while(space!=-1){
            String word = a.substring(start,space);
            start = space+1;
            space = a.indexOf(" ",start);
            result.add(word);

        }
            result.add(a.substring(start));
        return result;
    }


}
