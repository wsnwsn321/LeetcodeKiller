package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution229_MajorityElementII {
    public static void main(String[] args) {

    }
    //time:     O(n)
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if(nums.length == 0)
            return res;
        int num1=nums[0],num2 = nums[0];
        int count1 =0, count2=0;
        for (int i=0;i<nums.length;++i){
            if (nums[i]==num1)
                count1++;
            else if (nums[i]==num2)
                count2++;
            else if (count1==0){
                num1 =nums[i];
                count1++;
            }
            else if (count2==0){
                count2++;
                num2 =nums[i];
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;count2=0;
        for (int x:nums){
            if (x==num1) count1++;
            else if (x==num2) count2++;
        }
        if (count1>nums.length/3)
            res.add(num1);
        if (count2>nums.length/3)
            res.add(num2);
        return res;
    }
}
