package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution40_CombSumII {
    public static void main(String[] args) {

    }
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates.length==0) return res;
        Arrays.sort(candidates);
        backtracking(candidates,0,res,new ArrayList<>(),0,target);
        return res;

    }

    public void backtracking(int[] candidates,int pos, List<List<Integer>> res, List<Integer> temp,int current, int target){
        if (current>target)
            return;
        if (current==target){
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i=pos;i<candidates.length;++i){
            if (i>pos&&candidates[i]==candidates[i-1]) continue;
            temp.add(candidates[i]);
            backtracking(candidates,i+1,res,temp,current+candidates[i],target);
            temp.remove(temp.size()-1);
        }
    }
}
