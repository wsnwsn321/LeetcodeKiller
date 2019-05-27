package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution47_PermutationII {
    public static void main(String[] args) {

    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        DFS(res,temp,nums,new boolean[nums.length] );
        return res;
    }

    public void DFS(List<List<Integer>> res, List<Integer> temp, int[] nums,boolean[] used) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; ++i) {
            if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i - 1]) continue;
            used[i]=true;
            temp.add(nums[i]);
            DFS(res, temp, nums,used );
            used[i] =false;
            temp.remove(temp.size() - 1);
        }
    }
}
