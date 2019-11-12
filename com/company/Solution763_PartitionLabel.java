package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution763_PartitionLabel {
    public static void main(String[] args) {

    }
    public List<Integer> partitionLabels(String S) {
        int[] lastOcc = new int[26];
        List<Integer> res = new ArrayList<>();
        for (int i=0;i<S.length();++i){
            lastOcc[S.charAt(i)-'a'] = i;
        }
        int l=0,r=0;
        for (int i=0;i<S.length();++i){
            r = Math.max(r,lastOcc[S.charAt(i)-'a']);
            if (i==r){
                res.add(r-l+1);
                l = r+1;
            }
        }
        return res;
    }

}
