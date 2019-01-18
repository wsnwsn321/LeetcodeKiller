package com.company;

public class Solution953_VerifyingAlienDictionary {
    public static void main(String[] args) {

    }
    public boolean isAlienSorted(String[] words, String order) {
        String realOrder = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<words.length-1;++i){
            String w1 = words[i];
            String w2 = words[i+1];
            int j=0;
            while(j<w1.length()&&j<w2.length()){
                char c1 = w1.charAt(j);
                char c2 = w2.charAt(j);
                if(order.indexOf(c2)>order.indexOf(c1)) break;
                else if(order.indexOf(c2)==order.indexOf(c1)) j++;
                else return false;
            }
            if(j==w2.length()&&w1.length()>w2.length()) return false;
        }
        return true;
    }
}
