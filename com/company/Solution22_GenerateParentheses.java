package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution22_GenerateParentheses {
    public static void main(String[] args) {

    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtracking(res,"",0,0,n);
        return res;
    }
    public void backtracking(List<String> res,String current, int open,int close,int n){
        if (current.length()==2*n){
            res.add(current);
            return;
        }
        if (open<n) backtracking(res,current+'(',open+1,close,n);
        if (close<open) backtracking(res,current+')',open,close+1,n);
    }
}
