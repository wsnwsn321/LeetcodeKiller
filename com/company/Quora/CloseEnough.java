package com.company.Quora;

import java.lang.reflect.Array;
import java.util.*;

public class CloseEnough {
    public static void main(String[] args) {
        String a = "babzccc";
        String b = "abbzczz";
        System.out.println(check(a,b));
    }
    public static boolean check(String a, String b){
        Map<Character,Integer> ac = new HashMap<>();
        Map<Character,Integer> bc = new HashMap<>();
        for (char x:a.toCharArray()){
            ac.put(x,ac.getOrDefault(x,0)+1);
        }
        for (char x:b.toCharArray()){
            bc.put(x,bc.getOrDefault(x,0)+1);
        }
        if (!ac.keySet().equals(bc.keySet())) return false;
        int[] af = new int[ac.values().size()];
        for (int i=0;i<ac.values().size();++i){

        }
        int[] bf = new int[bc.values().size()];
        for (int i=0;i<bc.values().size();++i){

        }
        Arrays.sort(af);
        Arrays.sort(bf);
        return af.equals(bf);
    }
}
