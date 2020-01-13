package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution22_GenerateParentheses {
    public static void main(String[] args) {

    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtracking(n,0,0,res,"");
        return res;
    }
    public void backtracking(int n, int left, int right, List<String> res, String cur){
        if (cur.length()==n*2){
            res.add(cur);
            return;
        }
        if (left<n) backtracking(n,left+1,right,res,cur+"(");
        if (right<left) backtracking(n,left,right+1,res,cur+")");
    }
}
