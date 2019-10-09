package com.company;

import java.util.HashSet;
import java.util.Set;

public class Solution202_HappyNumber {
    public static void main(String[] args) {
        isHappy(19);
    }
    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n!=1&&!set.contains(n)){
            set.add(n);
            int newN =0;
            while (n>0){
                int cur = n%10;
                newN+=Math.pow(cur,2);
                n/=10;
            }
            n = newN;
        }
        return n==1?true:false;
    }
}
