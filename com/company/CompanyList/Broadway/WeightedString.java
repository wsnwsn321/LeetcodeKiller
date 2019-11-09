package com.company.CompanyList.Broadway;

import java.util.TreeMap;

public class WeightedString {
    public static void main(String[] args) {
        smallest(0);
    }
    public static String smallest(long w ){
        long[] weights = new long[26];
        weights[0] = 1;
        for (int i=1;i<weights.length;++i){
            weights[i] = (i+1)*weights[i-1]+weights[i-1];
        }
        TreeMap<Long,Character> weightMap = new TreeMap<>();
        for (int i=0;i<weights.length;++i){
            weightMap.put(weights[i],(char)('A'+i));
        }
        String res = "";
        while (w>0){
            long cur = weightMap.floorKey(w);
            res = weightMap.get(cur)+res ;
            w-=cur;
        }
        return res;
    }
}
