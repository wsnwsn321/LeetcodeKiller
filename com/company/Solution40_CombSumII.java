package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution40_CombSumII {
    public static void main(String[] args) {

    }
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backtracking(candidates,0,target,0,new ArrayList<>());
        return res;

    }
    public void backtracking(int[] candidates, int current, int target, int index, List<Integer> temp){
        if (current>target)
            return;
        if (current==target){
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i=index;i<candidates.length;++i){
            if(i>index&&candidates[i]==candidates[i-1]) continue;
            temp.add(candidates[i]);
            backtracking(candidates,current+candidates[i],target,i+1,temp);
            temp.remove(temp.size()-1);
        }
    }
}
