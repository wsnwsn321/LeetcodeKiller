package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution47_PermutationII {
    public static void main(String[] args) {

    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> num = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        for (int i=0;i<nums.length;++i){
            num.add(nums[i]);
        }
        backtracking(num,res,0);
        return res;
    }

    private void backtracking( List<Integer> num,List<List<Integer>> res,int index,boolean[] visited){
        if (index==num.size()) {
            res.add(new ArrayList<>(num));
            return;
        }
        for (int i=index;i<num.size();++i){
            if (i!=index&&num.get(i)==num.get(index)&&visited[i-1]==false) continue;
            if ()
            Collections.swap(num,i,index);
            backtracking(num,res,index+1);
            Collections.swap(num,index,i);
        }
    }
}
