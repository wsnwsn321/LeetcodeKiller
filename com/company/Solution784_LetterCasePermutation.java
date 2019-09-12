package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution784_LetterCasePermutation {
    public static void main(String[] args) {

    }
    public List<String> letterCasePermutation(String S) {
        char[] cs = S.toCharArray();
        List<String> res= new ArrayList<>();
        String t = S;
        backtracking(res,S,cs,0);
        return res;

    }
    public void backtracking(List<String> res, String temp, char[] cs, int current){
        if(!res.contains(temp)){
            res.add(temp);
            return;
        }
        for(int i=current;i<cs.length;++i){
            char[] tempc = temp.toCharArray();
            char og = ' ';
            if(cs[i]>=65&&cs[i]<=90){
                og = tempc[i];
                tempc[i] = Character.toLowerCase(cs[i]);
                temp = String.valueOf(tempc);
                backtracking(res,temp,cs,current+1);
                tempc[i] = og;
                temp = String.valueOf(tempc);
            }
            else if(cs[i]<=97&&cs[i]<=122){
                og = tempc[i];
                tempc = temp.toCharArray();
                tempc[i] = Character.toUpperCase(cs[i]);
                temp = String.valueOf(tempc);
                backtracking(res,temp,cs,current+1);
                tempc[i] = og;
                temp = String.valueOf(tempc);
            }

        }

    }

}
