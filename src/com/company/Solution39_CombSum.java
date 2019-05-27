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
        DFS(res,new ArrayList<>(),target,0,candidates);
        return res;

    }
    public void DFS(List<List<Integer>> res, List<Integer> temp,int remain,int pos,int[] cand){
        if(remain<0) return;
        else if(remain==0){
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i=pos;i<cand.length;++i){
            temp.add(cand[i]);
            DFS(res,temp,remain-cand[i],i,cand);
            temp.remove(temp.size()-1);
        }

    }
}
