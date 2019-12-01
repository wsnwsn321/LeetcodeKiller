package com.company;

import java.util.Stack;

public class Solution739_DailyTemperatures {
    public static void main(String[] args) {
        int[] a = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        dailyTemperatures(a);
    }
    public static int[] dailyTemperatures(int[] T) {
        Stack<Integer> s = new Stack<>();
        int[] res = new int[T.length];
        for (int i=T.length-1;i>=0;--i){
            while (s.size()>0&&T[s.peek()]<=T[i]){
                s.pop();
            }
            res[i] = s.size()>0?s.peek():0;
            s.push(i);
        }
        return res;
    }
}
