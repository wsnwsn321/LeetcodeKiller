package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PocketGemOA2 {
    public static void main(String[] args) {
    int[] a =new int[]{2,3,3,4,4};
    solution(a);
    }
    public static int solution(int[] A) {
        List<Integer> b = new ArrayList<>();
        for(int x:A){
            b.add(x);
        }
        HashSet<Integer> singleElement = new HashSet<>();
        for(int x: b){
            //if(!singleElement.contains(x)){
                singleElement.add(x);
            //}
        }
        int max =0;
        for(int x:singleElement){
            List<Integer> a = new ArrayList<>(b);
            int count=0;
            while(!a.isEmpty()){
                int e = a.remove(0);
                count+=e;
                solution2(a,x);
            }
            if(count>max) max = count;
        }
        return max;
    }
    public static List<Integer> solution2(List<Integer> a, int k) {
        a.removeAll(Arrays.asList(k+1));
        a.removeAll(Arrays.asList(k-1));
        return a;
    }

}
