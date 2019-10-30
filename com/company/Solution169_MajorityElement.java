package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution169_MajorityElement {
    public static void main(String[] args) {

    }
    public static int majorityElement(int[] nums) {
      Map<Integer,Integer> map = new HashMap<>();
      for (int x:nums){
          map.put(x,map.getOrDefault(x,0)+1);
          if (map.get(x)>nums.length/2) return x;
      }
      return -1;
    }

}
