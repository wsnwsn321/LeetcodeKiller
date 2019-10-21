package com.company.Quora;

import java.util.HashSet;
import java.util.Set;

public class divisorSubstring {
    public static void main(String[] args) {
        solution(555,1);
    }
    public static int solution(int n, int k){
        String ns = String.valueOf(n);
        Set<Integer> set = new HashSet<>();
        while (k<=ns.length()){
            String temp = ns.substring(0,k);
            set.add(Integer.parseInt(temp));
            if (k>1)
                ns = ns.substring(k-1);
            else ns = ns.substring(k);
        }
        int res=0;
        for (int x:set){
            res+=n%x==0?1:0;
        }
        return res;
    }
}
