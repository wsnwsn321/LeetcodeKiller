package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution78_Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();
        DFS(res,nums,0,comb);
        return res;
    }
    public void DFS(List<List<Integer>> res,int[] nums,int current,List<Integer> temp){
        res.add(new ArrayList<>(temp));
        for(int i=current;i<nums.length;++i){
            temp.add(nums[i]);
            DFS(res,nums,i+1,temp);
            temp.remove(temp.size()-1);
        }
    }
}
