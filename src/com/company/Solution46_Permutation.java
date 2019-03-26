package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution46_Permutation {
    public static void main(String[] args) {
        int[] num = new int[]{1,2,3};
        List<List<Integer>> res  = permute(num);
        int x = res.size();
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<nums.length;++i){
            List<Integer> temp = new ArrayList<>();
            temp.add(nums[i]);
            DFS(res,temp,nums);
        }
        return res;
    }

    public static void DFS(List<List<Integer>> res, List<Integer> temp, int[] nums){
        if(temp.size()==nums.length){
            res.add(temp);
            return;
        }
        for(int j=0;j<nums.length;++j){
            if(!temp.contains(nums[j])){
                List<Integer> t = new ArrayList<>(temp);
                t.add(nums[j]);
                DFS(res,t,nums);
            }

        }
    }




//    public static List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>> res = new ArrayList<>();
//        for(int i=0;i<nums.length;++i){
//            List<Integer> temp = new ArrayList<>();
//            temp.add(nums[i]);
//            DFS(res,temp,nums);
//        }
//        return res;
//    }
//
//    public static void DFS(List<List<Integer>> res, List<Integer> temp, int[] nums){
//        if(temp.size()==nums.length){
//            res.add(temp);
//            return;
//        }
//        for(int j=0;j<nums.length;++j){
//            if(!temp.contains(nums[j])){
//                List<Integer> t = new ArrayList<>(temp);
//                t.add(nums[j]);
//                DFS(res,t,nums);
//            }
//
//        }
//    }
}
