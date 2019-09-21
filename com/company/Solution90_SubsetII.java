package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution90_SubsetII {
    public static void main(String[] args) {

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backtracking(res,nums,0,new ArrayList<>());
        return res;
    }
    public void backtracking(List<List<Integer>> res,int[] nums,int current,List<Integer> temp){
       res.add(new ArrayList<>(temp));
       for (int i=current;i<nums.length;++i){
           if(i>current&&nums[i-1]==nums[i]) continue;
           temp.add(nums[i]);
           backtracking(res,nums,i+1,temp);
           temp.remove(temp.size()-1);
       }
    }
}
