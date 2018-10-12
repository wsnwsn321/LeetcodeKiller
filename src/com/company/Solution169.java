package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution169 {
    public static void main(String[] args) {

    }
    public static int majorityElement(int[] nums) {
       Map<Integer,Integer> m  = new HashMap<>();
       int r = 0;
       for(int x:nums){
           if(m.get(x)==null){
               m.put(x,1);
           }
           else{
               m.put(x,m.get(x)+1);
               if(m.get(x)>nums.length/2) r = x;
           }
       }
       return  r;
    }

}
