package com.company;

public class Solution55_JumpGame {
    public static void main(String[] args) {

    }
    public boolean canJump(int[] nums) {
        //reachable represents the largest index we could reach so far
        int reachable = 0;
        for (int i = 0; i < nums.length; ++i) {
            //if there's a index i larger than reachable, means we can't reach ith index
            //which means we can't reach the last index
            if (i > reachable) return false;
            //update reachable
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }
}
