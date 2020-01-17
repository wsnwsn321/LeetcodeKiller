package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution47_PermutationII {
    public static void main(String[] args) {
        int[] a = new int[]{1,1,2};
        permuteUnique(a);
    }
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited =new boolean[nums.length];
        Arrays.sort(nums);
        backtracking(nums,new ArrayList<>(),res,visited);
        return res;
    }

    private static void backtracking(int[] nums,List<Integer> temp,List<List<Integer>> res,boolean[] visited){
        if (temp.size()==nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i=0;i<nums.length;++i){
            if (visited[i]) continue;
            if (i>0&&nums[i]==nums[i-1]&&!visited[i-1]) {
                continue;
            }
            visited[i] =true;
            temp.add(nums[i]);
            backtracking(nums,temp,res,visited);
            temp.remove(temp.size()-1);
            visited[i]=false;
        }
    }
}
