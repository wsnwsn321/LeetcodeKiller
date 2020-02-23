package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution17_LetterCombOfPhoneNum {
    public static void main(String[] args) throws Exception {
            String s = "23";
           List<String> a = letterCombinations(s);
           int x = 1;
    }
    //time:     O(3^N+4^M) //N = letters with 3 chars under it, M = letters with 4 chars under it
    // space:   O(3^N+4^M)
    static String[] ref = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static   List<String> letterCombinations(String digits) throws Exception {
        List<String> res = new ArrayList<>();
        if(digits.length()==0) return res;
        backtracking(digits,res,"",0);
        return res;
    }

    public static void backtracking(String digits,List<String> res, String cur,int pos) throws Exception{
        if (cur.length()==digits.length()){
            res.add(new String(cur));
            return;
        }
        char ch = digits.charAt(pos);
        if (ch<'2'||ch>'9')
            throw new Exception("invalid input!");
        String temp = ref[digits.charAt(pos)-'2'];
        for (int j=0;j<temp.length();++j){
            backtracking(digits,res,cur+temp.charAt(j),pos+1);
        }

    }

}
