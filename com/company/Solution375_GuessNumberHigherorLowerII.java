package com.company;

public class Solution375_GuessNumberHigherorLowerII {
    public static void main(String[] args) {

    }
    public int getMoneyAmount(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int res = mid;
            if (res == 0)
                return mid;
            else if (res < 0)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
