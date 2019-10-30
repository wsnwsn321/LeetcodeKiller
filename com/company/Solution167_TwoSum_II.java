package com.company;

import java.util.HashMap;
import java.util.Map;

public class Solution167_TwoSum_II {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] numbers, int target) {
      int l=0,r = numbers.length-1;
      while (l<r){
          if (numbers[l]+numbers[r]==target){
              return new int[]{l+1,r+1};
          }
          if (numbers[l]+numbers[r]>target){
              r--;
          }
          else l++;
      }
      return new int[]{};
    }
}
