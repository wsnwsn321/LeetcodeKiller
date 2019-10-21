package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution245_ShortestWordDistanceIII {
    public static void main(String[] args) {

    }
    public int shortestWordDistance(String[] words, String word1, String word2) {
        int index1=-1,index2=-1;
        int res=words.length;
        int sameRes = words.length;
        boolean same = word1.equals(word2);
        for (int i=0;i<words.length;++i){
            if (words[i].equals(word1)){
                if (same){
                    if (index1!=-1) {
                        sameRes = Math.min(sameRes,i-index1);
                    }
                }
                index1 =i;
                if (index2!=-1)
                    res = Math.min(res,Math.abs(index1-index2));

            }
            else if (words[i].equals(word2)) {
                index2 = i;
                if (index1 != -1)
                    res = Math.min(res, Math.abs(index1 - index2));

            }

        }
        return res;
    }
}
