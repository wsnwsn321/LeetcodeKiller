package com.company;

import java.util.Arrays;
import java.util.Collections;

public class Solution698_PartitiontoKEqualSumSubsets {
    public static void main(String[] args) {

    }
    public boolean canPartitionKSubsets(int[] nums, int k) {
        if (k > nums.length) return false;
        int sum = 0;
        for (int num : nums) sum += num;
        if (sum % k != 0) return false;
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        return dfs(nums,k,visited,sum/k,0,0);
    }
    public boolean dfs(int[] nums, int k, boolean[] visited, int target,int cur_sum,int pos){
        if (k==0) return true;
        if (cur_sum==target&&dfs(nums,k-1,visited,target,0,0))
            return true;
        for (int i=pos;i<nums.length;++i){
            if (!visited[i]&&cur_sum+nums[i]<=target){
                visited[i]= true;
                if (dfs(nums,k,visited,target,cur_sum+nums[i],i+1))
                    return true;
                visited[i] = false;
            }
        }
        return false;
    }

}
