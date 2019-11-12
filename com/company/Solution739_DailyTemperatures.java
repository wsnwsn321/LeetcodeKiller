package com.company;

import java.util.Stack;

public class Solution739_DailyTemperatures {
    public static void main(String[] args) {
        int[] a = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        dailyTemperatures(a);
    }
    public static int[] dailyTemperatures(int[] T) {
        int[] res = new int[T.length];
        Stack<Integer> s = new Stack<>();
        for (int i=T.length-1;i>=0;--i){
            while (s.size()>0&&T[s.peek()]<=T[i]){
                s.pop();
            }
            if (s.size()==0) res[i] = 0;
            else res[i] = s.peek() - i;
            s.push(i);
        }
        return res;
    }
}
