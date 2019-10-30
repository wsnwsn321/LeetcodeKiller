package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution216_CombSumIII {
    public static void main(String[] args) {

    }
    List<List<Integer>> res =new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        backtracking(k,n,new ArrayList<>(),0,1);
        return res;
    }
    public void backtracking(int k, int n,List<Integer> temp, int curSum, int pos){
        if (temp.size()==k){
            if (curSum==n){
                res.add(new ArrayList<>(temp));
            }
            return;
        }
        for (int i=pos;i<10;++i){
            temp.add(i);
            backtracking(k,n,temp,curSum+i,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
