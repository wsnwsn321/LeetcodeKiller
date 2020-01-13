package com.company;

public class Solution45_JumpGameII {
    public static void main(String[] args) {

    }
    public int jump(int[] nums) {
        if (nums.length <= 1) return 0;
        int curMax = 0; // to mark the last element in a level
        int level = 0, i = 0;
        while (i <= curMax) {
            int furthest = curMax; // to mark the last element in the next level
            for (int j=i; j <= curMax; j++) {
                furthest = Math.max(furthest, nums[j] + j);
                if (furthest >= nums.length - 1) return level + 1;
            }
            level++;
            i=curMax;
            curMax = furthest;
        }
        return -1; // if i < curMax, i can't move forward anymore (the last element in the array can't be reached)
    }
}
