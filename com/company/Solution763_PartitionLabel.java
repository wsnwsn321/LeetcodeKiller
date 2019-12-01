package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution763_PartitionLabel {
    public static void main(String[] args) {

    }
    public List<Integer> partitionLabels(String S) {
        List<Integer> res = new ArrayList<>();
        int l=0;
        int lastIndex = 0;
        for (int i=0;i<S.length();++i){
            char ch = S.charAt(i);
            lastIndex = Math.max(lastIndex,S.lastIndexOf(ch));
            if (i==lastIndex){
                res.add(i-l+1);
                l =i+1;
            }
        }
        return res;
    }

}
