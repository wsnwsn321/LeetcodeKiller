package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution39_CombSum {
    public static void main(String[] args) {

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backtracking(candidates,res,new ArrayList<>(),0,target,0);
        return res;

    }

    public void backtracking(int[] candidates,List<List<Integer>> res,List<Integer> temp,int current, int target,int index){
        if (current>target) return;
        if (current==target) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i=index;i<candidates.length;++i){
            temp.add(candidates[i]);
            backtracking(candidates,res,temp,current+candidates[i],target,i);
            temp.remove(temp.size()-1);

        }
    }
}
