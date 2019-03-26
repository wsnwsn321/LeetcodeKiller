package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution17_LetterCombOfPhoneNum {
    public static void main(String[] args) {
            String s = "234";
           List<String> a = letterCombinations(s);
           int x = 1;
    }
    public static List<String> letterCombinations(String digits) {
        
        String[] dictionary = new String[]{"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        char[] d = digits.toCharArray();
        List<String> res = new ArrayList<>();
        String[] letters = new String[digits.length()];
        for (int i=0;i<d.length;++i){
            int num = Character.getNumericValue(d[i])-2;
            letters[i] = dictionary[num];
        }
        String comb = "";
        DFS(res,letters,0,comb);
        return res;

    }

    public static void DFS(List<String> res, String[] letters, int index,String comb){
        if(comb.length()==letters.length){
            res.add(comb);
            return;
        }
        for(int i=0;i<letters[index].length();++i){
            char temp=letters[index].charAt(i);
            DFS(res,letters,index+1,comb+temp);
        }
    }
}
