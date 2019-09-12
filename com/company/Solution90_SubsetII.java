package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution90_SubsetII {
    public static void main(String[] args) {

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();
        Arrays.sort(nums);
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
