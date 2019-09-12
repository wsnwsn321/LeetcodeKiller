package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution763 {
    public static void main(String[] args) {
    String a = "ababcbacadefegdehijhklij";
        List<Integer> indices = new ArrayList<>();
        indices = partitionLabels(a);
        System.out.println(indices);
    }


    public static List<Integer> partitionLabels(String S) {
        //int count = 0;
        List<Integer> indices = new ArrayList<>();
        List<Character> usedChar = new ArrayList<>();
        for (int j = 0; j < S.length(); j++) {
            int seperator = S.lastIndexOf(S.charAt(j));
            usedChar.add(S.charAt(j));
            int count =j;
            while(seperator==S.indexOf(S.charAt(count))){
                count++;
                if(count>S.length()-1){
                    indices.add(seperator+1-j);
                    return indices;
                }
                else {
                    seperator = S.lastIndexOf(S.charAt(count));
                }
            }
            for (int i = j; i < seperator; i++) {
                if (!usedChar.contains(S.charAt(i))) {
                    char letter = S.charAt(i);
                    usedChar.add(letter);
                    int lastIndexOfCurrent = S.lastIndexOf(letter, i);
                    if (lastIndexOfCurrent < seperator) usedChar.add(letter);
                    else seperator = lastIndexOfCurrent;
                }
            }
            indices.add((seperator+1)-j);
            j=seperator;
        }

        return indices;
    }
}
