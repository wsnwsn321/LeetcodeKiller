package com.company;

public class Solution243_ShortestWordDistance {
    public static void main(String[] args) {

    }
    public int shortestDistance(String[] words, String word1, String word2) {
        int i1 = -1,i2 = -1;
        int res=Integer.MAX_VALUE;
        for (int i=0;i<words.length;++i){
            String cur = words[i];
            if (cur.equals(word1)){
                i1 = i;
            }
            if (cur.equals(word2)){
                i2 = i;
            }
            if (i2!=-1&&i1!=-1)
                res = Math.min(res,Math.abs(i1-i2));
        }
        return res;
    }
}
