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
            if(!m.containsKey(x)){
                m.put(x,1);
            }
            else{
                int count = m.get(x);
                m.put(x,count+1);
            }
        }
        int g=-1;
        for(Map.Entry<Integer,Integer> set:m.entrySet()){
            if(g==-1) g = set.getValue();
            else{
                g = gcd(g,set.getValue());
            }

        }

        return g>=2;
    }

    public int gcd(int x, int y) {
        return x == 0 ? y : gcd(y%x, x);
    }
}
