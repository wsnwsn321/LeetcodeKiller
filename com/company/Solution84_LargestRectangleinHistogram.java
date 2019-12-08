package com.company;

import java.util.Stack;

public class Solution84_LargestRectangleinHistogram {
    public static void main(String[] args) {

    }
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        int res = 0;
        for (int i = 0; i < heights.length; ++i) {
            int h = heights[i];
            while (s.peek() !=-1 && heights[s.peek()] >= h) {
                int curHeight = heights[s.pop()];
                int preIndex = s.peek();
                int curArea = curHeight * (i - preIndex - 1);
                res = Math.max(res, curArea);
            }
            s.push(i);
        }
        while (s.peek() != -1) {
            int curHeight = heights[s.pop()];
            res = Math.max(res, curHeight * (heights.length - s.peek() - 1));
        }
        return res;
    }
}
