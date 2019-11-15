package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class Solution914_XofAKindInADeckofCards {
    public static void main(String[] args) {

    }
    public boolean hasGroupsSizeX(int[] deck) {
        int min =Integer.MAX_VALUE;
        if(deck.length<2) return false;
        Map<Integer,Integer> m = new HashMap<>();
        for(int x:deck){
            m.put(x,m.getOrDefault(x,0)+1);
        }
        int g = -1;
        for (int x: m.values()){
            if (g==-1)
                g = x;
            else{
                g = gcd(g,x);
                if (g<2)
                    return false;
            }
        }
        return true;
    }

    public int gcd(int a, int b)
    {
        // Everything divides 0
        if (a == 0||b==0)
            return a==0?b:a;

        // base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
}
