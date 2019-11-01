package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution245_ShortestWordDistanceIII {
    public static void main(String[] args) {

    }
    public int shortestWordDistance(String[] words, String word1, String word2) {
        int i1 = -1,i2 = -1;
        int res=Integer.MAX_VALUE;
        int sameRes = Integer.MAX_VALUE;
        boolean same =false;
        if (word1.equals(word2)) same =true;
        for (int i=0;i<words.length;++i){
            String cur = words[i];
            if (cur.equals(word1)){
                if (same&&i1!=-1){
                    sameRes = Math.min(sameRes,Math.abs(i-i1));
                }
                i1 = i;
            }
            else if (cur.equals(word2)){
                i2 = i;
            }
            if (i2!=-1&&i1!=-1)
                res = Math.min(res,Math.abs(i1-i2));
        }
        return same?sameRes:res;
    }
}
