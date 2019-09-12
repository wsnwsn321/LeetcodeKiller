package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution830_PositionOfLargeGroups {
    public static void main(String[] args) {

    }
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> result  = new ArrayList<>();
        int l=0,r=0;
        char[] cs = S.toCharArray();
        while(r<cs.length){
            while(cs[r]==cs[l]) r++;
            if(r-l>=3) {
                List<Integer> temp = new ArrayList<>();
                temp.add(l);
                temp.add(r);
                result.add(temp);
            }
            l=r;
            r++;
        }
        return result;
    }
}
