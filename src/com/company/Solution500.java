package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution500 {
    public static void main(String[] args) {
        String[] a = new String[]{"qaz","wsx","edc","rfv","tgb","yhn","ujm","ik","pklo","ppppppp"};
        System.out.println(findWords(a));
    }
    public static String[] findWords(String[] words) {
        ArrayList<String> result =new ArrayList<>();
        ArrayList<String> newResult =new ArrayList<>(Arrays.asList(words));
        String[] rows = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
        ArrayList<String> alphabet = new ArrayList<String>(Arrays.asList(rows));
        for(String v:words){
            String up = v.toUpperCase();
            String check = "";
            for(int i=0;i<up.length();i++){
                if(rows[0].contains(up.substring(i,i+1)))
                   check+=0;

               else if(rows[1].contains(up.substring(i,i+1)))
                    check+=1;

               else if(rows[2].contains(up.substring(i,i+1)))
                    check+=2;
            }
            result.add(check);
        }
        for(int i=0;i<result.size();i++){
            String r = result.get(i);
            for(char c:r.toCharArray()){
                if(c!=r.toCharArray()[0]){
                    newResult.set(i,"");
                    break;
                }
            }
        }
        ArrayList<String> rS =new ArrayList<>();
        for(String v:newResult){
            if (!v.equals("") ){
               rS.add(v);
            }
        }
        String[] rt = new String[rS.size()];
        rt = rS.toArray(rt);
        return rt;
    }

}
