package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution77_Combinations {
    public static void main(String[] args) {

        int n=4,k=2;
        combine(n,k);
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res= new ArrayList<>();
        backtracking(n,k,1,new ArrayList<>(),res);
        return res;
    }
    public static void backtracking(int n, int k, int current, List<Integer>temp, List<List<Integer>> res){
        if (temp.size()==k){
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i=current;i<=n;++i){
            temp.add(i);
            backtracking(n,k,i+1,temp,res);
            temp.remove(temp.size()-1);
        }
    }

}
