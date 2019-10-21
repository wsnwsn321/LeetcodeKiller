package com.company.Quora;

import java.util.HashSet;
import java.util.Set;

public class brokenKeyboard {
    public static void main(String[] args) {
        String w = "hello, my dear friend!";
        broken(w,"helom");
    }
    public static int broken(String words, String text){
        words = words.toLowerCase();
        String[] str = words.split("\\s+");
        Set<Character> dic = new HashSet<>();
        for (char x: text.toCharArray())
            dic.add(x);
        boolean flag = true;
        int res =0;
        for (String w:str){
            for (int i=0;i<w.length();++i){
                char cur = w.charAt(i);
                if (Character.isLetter(cur)&&!dic.contains(cur)){
                    flag = false;
                    break;
                }
            }
            if (flag) res++;
        }
        return res;
    }
}
