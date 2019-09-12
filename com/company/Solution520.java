package com.company;

public class Solution520 {
    public static void main(String[] args) {

        String w ="Sa";
        detectCapitalUse(w);
    }
    public static boolean detectCapitalUse(String word) {
        char[] w = word.toCharArray();
        boolean cap = false;
        boolean low = false;
        if(w.length==1) return true;
        if(w[0]>65&&w[0]<90){
            for(int i=1;i<w.length;++i){
                if(w[i]>64&&w[i]<91) cap = true;
                if(w[i]>96&&w[i]<123) low = true;
            }
        }
        else{
            for(int i=1;i<w.length;++i){
                if(w[i]>64&&w[i]<91){
                    return false;
                }
            }
            return true;
        }
        return cap^low;
    }
}
