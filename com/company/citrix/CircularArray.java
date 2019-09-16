package com.company.citrix;

import java.util.*;

public class CircularArray {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1,3,2,3));
        System.out.println(circularArray(3, nums));
        return;
    }
    /*
        problem 14 : Circulat Array
     */
    public static int circularArray(int n, List<Integer> ends) {
        //corner case

        //regular cases
        //transfer list into array
        int[] endNodes = new int[ends.size()];
        for (int i=0;i<ends.size();++i){
            endNodes[i] = ends.get(i);
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < endNodes.length - 1; i++) {
            int start = endNodes[i];
            int end = endNodes[i+1];
            map.put(start, map.getOrDefault(start, 0) + 1);
            int j = 1;
            while((start + j) % n != end%n) {
                int cur = (start + j) % n;
                map.put(cur, map.getOrDefault(cur, 0) + 1);
                j++;
            }
            map.put(end, map.getOrDefault(end, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        int result = Integer.MAX_VALUE;
        for(Map.Entry<Integer, Integer> e : map.entrySet()) {
            if(e.getValue() > max) {
                max = Math.max(max, e.getValue());
                result = e.getKey();
            }else if(e.getValue() == max) {
                result = Math.min(result, e.getKey());
            }
        }
        return result;
    }
}
