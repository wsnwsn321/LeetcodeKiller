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
        for(int i =0;i<asteroids.length;++i){
            if(asteroids[i]>0){
                s.push(asteroids[i]);
            }
            else{
                if(s.isEmpty()||s.peek()<0){
                    s.push(asteroids[i]);
                }
                else{
                    if(Math.abs(s.peek())<=Math.abs(asteroids[i])) {

                        if(Math.abs(s.peek())<Math.abs(asteroids[i])){
                            i--;
                        }
                        s.pop();
                    }

                }
            }

        }
        int[] res = new int[s.size()];
        int size = s.size();
        for(int i=size-1;i>=0;--i){
            res[i] = s.pop();
        }
        return res;
    }
}
