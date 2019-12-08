package com.company;

public class Solution1055_ShortestWaytoFormString {
    public static void main(String[] args) {

    }
    public int shortestWay(String source, String target) {
        int j=0,res=1;
        for (int i=0;i<target.length();++i){
            char cur = target.charAt(i);
            if (source.indexOf(cur)==-1) return -1;
            while (j<source.length()&&source.charAt(j)!=cur){
                j++;
            }
            //current char is not found in the remaining source string, rescan source from start
            if (j==source.length()){
                res++;
                j=0;
                i--;
            }
            else j++;

        }
        return res;
    }
}
