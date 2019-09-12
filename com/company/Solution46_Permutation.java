package com.company;

import java.util.*;

public class Solution46_Permutation {
    public static void main(String[] args) {
        int[] num = new int[]{1,2,3};
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> num = new ArrayList<>();
        for (int i=0;i<nums.length;++i){
            num.add(nums[i]);
        }
        backtracking(num,res,0);
        return res;
    }

    private void backtracking( List<Integer> num,List<List<Integer>> res,int index){
        if (index==num.size()) {
            res.add(new ArrayList<>(num));
            return;
        }
        for (int i=index;i<num.size();++i){
            Collections.swap(num,i,index);
            backtracking(num,res,index+1);
            Collections.swap(num,index,i);
        }
    }

}
