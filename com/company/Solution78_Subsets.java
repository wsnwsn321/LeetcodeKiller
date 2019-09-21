package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution78_Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrakcing(nums,0, new ArrayList<>(),res);
        return res;
    }

    public void backtrakcing(int[] nums, int current,List<Integer> temp, List<List<Integer>> res){
        res.add(new ArrayList<>(temp));
        for (int i=current;i<nums.length;++i){
            temp.add(i);
            backtrakcing(nums,i+1,temp,res);
            temp.remove(temp.size()-1);
        }
    }

}
