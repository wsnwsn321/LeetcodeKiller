package com.company;

import java.util.*;

public class Solution350_IntersectionOfTwoArrays {
    public static void main(String[] args) {

    }
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Map<Integer,Integer> m = new HashMap<>();
        for(int x:nums1){
            if(!m.containsKey(x))
                m.put(x,1);
        }
        for(int x:nums2){
            if(m.get(x)==1){
                m.put(x,2);
            }
        }
        List<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:m.entrySet()){
            if(e.getValue()==2){
                res.add(e.getKey());
            }
        }
        int[] ret = new int[res.size()];
        for(int i=0;i<res.size();++i){
            ret[i] = res.get(i);
        }
        return ret;
//        List<Integer> l = new ArrayList<>();
//        int i=0,j=0;
//        while(i<nums1.length&&j<nums2.length){
//            if(nums1[i]==nums2[j]){
//                l.add(nums1[i]);
//                i++;j++;
//            }
//            else if(nums1[i]<nums2[j]){
//                i++;
//            }
//            else{
//                j++;
//            }
//        }
//        int[] result = new int[l.size()];
//        int count=0;
//        for(int x:l){
//            result[count++] = x;
//        }
//        return result;
    }
}
