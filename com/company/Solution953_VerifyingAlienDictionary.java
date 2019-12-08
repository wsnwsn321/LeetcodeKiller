package com.company;

public class Solution953_VerifyingAlienDictionary {
    public static void main(String[] args) {

    }
    public boolean isAlienSorted(String[] words, String order) {
        for(int i=0;i<words.length-1;++i){
            String w1 = words[i];
            String w2 = words[i+1];
            int index =0;
            while (index<w1.length()&&index<w2.length()){
                char c1 = w1.charAt(index);
                char c2 = w2.charAt(index);
                if (order.indexOf(c2)<order.indexOf(c1)) return false;
                if (order.indexOf(c1)<order.indexOf(c2)) break;
                else index++;
            }
            if (index==w2.length()&&w1.length()>w2.length()) return false;
        }
        return true;
    }
}
