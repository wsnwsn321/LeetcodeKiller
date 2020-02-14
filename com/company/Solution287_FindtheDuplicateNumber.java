package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution287_FindtheDuplicateNumber {
    public static void main(String[] args) {

    }
    //Floyd's Tortoise and Hare (Cycle Detection)
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[nums[0]];
        //first step: find circle entrance
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        //second step: find intersection point
        int pt1 = nums[0];
        int pt2 = nums[slow];
        while (pt1 != pt2) {
            pt1 = nums[pt1];
            pt2 = nums[pt2];
        }
        return pt1;
    }
}
