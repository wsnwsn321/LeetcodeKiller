package com.company;

import java.util.PriorityQueue;

public class Solution378_KthSmallestElementinaSortedMatrix {
    public static void main(String[] args) {
        int[][] b = new int[][]{{1,5,9},{7,11,13},{12,13,15}};
        //kthSmallest(b,8);
    }
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int lo = matrix[0][0], hi = matrix[n - 1][n - 1];
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int count = getLessEqual(matrix, mid);
            if (count < k) lo = mid + 1;
            else hi = mid - 1;
        }
        return lo;
    }
    private int getLessEqual(int[][] matrix, int val) {
        int count = 0;
        int i = 0, j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0) {
            int cur = matrix[i][j];
            //go to cur's left
            if (cur > val)
                j--;
            //any number to cur's left is <=val, add the number into count and go down one row
            else {
                count += j + 1;
                i++;
            }
        }
        return count;
    }

}
