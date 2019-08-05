package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution216_CombSumIII {
    public static void main(String[] args) {

    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        DFS(res,new ArrayList<>(),1,n,k);
        return res;

    }
    public void DFS(List<List<Integer>> res, List<Integer> temp, int current, int reminder,int k){
        if(temp.size()>k) {
            return;
        }
        if(reminder==0&&temp.size()==k) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=current;i<=9;++i){
            temp.add(i);
            DFS(res,temp,i+1,reminder-i,k);
            temp.remove(temp.size()-1);
        }
    }
}
