package com.company;

import java.util.*;

public class Solution46_Permutation {
    public static void main(String[] args) {

        int[] num = new int[]{1,1,2};

    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        DFS(res,temp,nums,0);
        return res;
    }

    public void DFS(List<List<Integer>> res, List<Integer> temp, int[] nums,int current){
        if(temp.size()==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;++i){
            if(!temp.contains(nums[i])){
                temp.add(nums[i]);
                DFS(res,temp,nums,i+1);
                temp.remove(temp.size()-1);

            }

        }
    }

}
