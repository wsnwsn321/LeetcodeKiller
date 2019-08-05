package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution77_Combinations {
    public static void main(String[] args) {

        int n=4,k=2;
        combine(n,k);
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backtracking(res,new ArrayList<>(),n,k,1);
        return res;
    }

    public static void backtracking(List<List<Integer>> res, List<Integer> temp, int n, int k, int current){
        if(temp.size()==k){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=current;i<=n;++i){
            temp.add(i);
            backtracking(res,temp,n,k,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
