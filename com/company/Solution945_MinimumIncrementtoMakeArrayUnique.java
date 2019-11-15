package com.company;

public class Solution945_MinimumIncrementtoMakeArrayUnique {
    public static void main(String[] args) {

    }
    public int minIncrementForUnique(int[] A) {
        int[] count = new int[80002];
        for (int x: A) count[x]++;

        int ans = 0, taken = 0;

        for (int x = 0; x < 80002; ++x) {
            if (count[x] >= 2) {
                //count[x]-1 number of x needs to be increased
                taken += count[x] - 1;
                //sub these numbers from ans since they're going to be change to another number
                ans -= x * (count[x] - 1);
            }
            else if (taken > 0 && count[x] == 0) {
                //find an empty slot, change one of the takens to this number
                taken--;
                ans += x;
            }
        }

        return ans;
    }
}
