package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution40_CombSumII {
    public static void main(String[] args) {

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backtrakcing(candidates,0,target,0,res,new ArrayList<>());
        return res;

    }
    public void backtrakcing(int[] candidates, int current, int target, int index, List<List<Integer>> res, List<Integer> temp){
        if (current==target){
            res.add(new ArrayList<>(temp));
            return;
        }
        if (current>target)return;
        for (int i=index;i<candidates.length;++i){
            if (i!=index&&candidates[i]==candidates[i-1]) continue;
            temp.add(candidates[i]);
            backtrakcing(candidates,current+candidates[i],target,i+1,res,temp);
            temp.remove(temp.size()-1);
        }
    }
}
