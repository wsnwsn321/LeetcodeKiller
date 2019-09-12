package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution17_LetterCombOfPhoneNum {
    public static void main(String[] args) {
            String s = "23";
           //List<String> a = letterCombinations(s);
           int x = 1;
    }
    //time:     O(3^N+4^M) //N = letters with 3 chars under it, M = letters with 4 chars under it
    // space:   O(3^N+4^M)
    String[] ref = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public  List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.length()==0) return res;
        int[] nums = new int[digits.length()];
        for (int i=0;i<digits.length();++i){
            nums[i] = digits.charAt(i)-'2';
        }
        DFS(res,nums,0,"");
        return res;
    }

    public  void DFS(List<String> res, int[] nums, int index,String comb){
        if(comb.length()==nums.length) {
            res.add(comb);
            return;
        }
        for (int j=0;j<ref[nums[index]].length();++j){
            comb+=ref[nums[index]].toCharArray()[j];
            DFS(res,nums,index+1,comb);
            comb = comb.substring(0,comb.length()-1);
        }
    }
}
