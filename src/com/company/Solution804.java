package com.company;

import java.util.ArrayList;

public class Solution804 {
    public static void main(String[] args) {

    String[] words = new String[]{"gin","zen","gig","msg","ad"};
    System.out.println(uniqueMorseRepresentations(words));
    }
    public static int uniqueMorseRepresentations(String[] words) {
        String[] table = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        //97-122 a-z
        ArrayList<String> code = new ArrayList<String>();
        for(int i=0;i<words.length;i++){
            String temp = words[i];
            String moseCode = "";
            for(int j = 0;j<temp.length();j++){
                moseCode +=table[temp.charAt(j)-97];
            }
            if(!code.contains(moseCode)){
                code.add(moseCode);
            }
        }
        return code.size();
    }
}
