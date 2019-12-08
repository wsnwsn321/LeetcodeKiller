package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution735_AsteroidCollision {
    public static void main(String[] args) {
        int[] a  = new int[]{3,2,5};
        asteroidCollision(a);
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        for (int x : asteroids) {
            if (x > 0)
                s.push(x);
            else {
                boolean destroied = false;
                //remove all right-going numbers that is smaller than x
                while (!s.isEmpty() && s.peek() > 0 && s.peek() <= Math.abs(x)) {
                    if (!s.isEmpty()&&s.peek() + x == 0) {
                        destroied = true;
                        s.pop();
                        break;
                    }
                    else
                        s.pop();

                }
                if (!destroied && (s.isEmpty() || s.peek() < 0))
                    s.push(x);
            }
        }
        int[] res = new int[s.size()];
        int size = s.size();
        for (int i = size - 1; i >= 0; --i) {
            res[i] = s.pop();
        }
        return res;
    }
}
