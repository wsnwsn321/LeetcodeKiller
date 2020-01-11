package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution442_FindAllDuplicatesinanArray {
    public static void main(String[] args) {

    }
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int x:nums){
            int index = Math.abs(x)-1;
            if (nums[index]<0){
                res.add(index+1);
            }
            else
                nums[index] = -nums[index];
        }
        return res;
    }
}
