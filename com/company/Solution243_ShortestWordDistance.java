package com.company;

public class Solution243_ShortestWordDistance {
    public static void main(String[] args) {

    }
    public int shortestDistance(String[] words, String word1, String word2) {
        int index1=-1,index2=-1;
        int res=words.length;
        for (int i=0;i<words.length;++i){
            if (words[i].equals(word1)){
                index1 =i;
                if (index2!=-1)
                    res = Math.min(res,Math.abs(index1-index2));

            }
            else if (words[i].equals(word2)){
                index2 =i;
                if (index1!=-1)
                    res = Math.min(res,Math.abs(index1-index2));
            }

        }
        return res;
    }
}
