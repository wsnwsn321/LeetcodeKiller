package com.company.CompanyList.Wepay;

import java.util.HashMap;
import java.util.Map;

public class ArraySummation {
    public static void main(String[] args) {

    }
    public static boolean containSum(int[] a1, int[] a2){
        for (int x:a2){
            if (twoSum(a1,x))
                return true;
        }
        return false;
    }

    public static boolean twoSum(int[] nums, int target) {
        Map<Integer,Integer> m = new HashMap<>();
        for (int i=0;i<nums.length;++i){
            if (m.containsKey(target-nums[i])){
               return true;
            }
            else{
                m.put(nums[i],i);
            }
        }
        return false;
    }
}
