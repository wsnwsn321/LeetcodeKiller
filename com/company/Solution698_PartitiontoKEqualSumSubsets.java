package com.company;

import java.util.Arrays;
import java.util.Collections;

public class Solution698_PartitiontoKEqualSumSubsets {
    public static void main(String[] args) {

    }
    public boolean canPartitionKSubsets(int[] a, int k) {
        if (k > a.length) return false;
        int sum = 0;
        for (int num : a) sum += num;
        if (sum % k != 0) return false;
        Arrays.sort(a);
        return  canPartition(a.length-1, a, new boolean[a.length], k, 0, sum / k);
    }

    boolean canPartition(int start, int[] a, boolean[] seen, int k, int sum, int target) {
        if (k == 1) return true;
        if (sum == target)
            return canPartition(a.length-1, a, seen, k - 1, 0, target);
        for (int i = start; i >=0; --i)
            if (!seen[i]) {
                seen[i] = true;
                if (canPartition(i - 1, a, seen, k, sum + a[i], target))
                    return true;
                seen[i] = false;
            }
        return false;
    }

}
