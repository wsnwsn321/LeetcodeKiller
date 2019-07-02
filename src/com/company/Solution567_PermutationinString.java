package src.com.company;

import java.util.Arrays;

public class Solution567_PermutationinString {
    public static void main(String[] args) {

    }
    public boolean checkInclusion(String s1, String s2) {
        int[] s1p = new int[26];
        int[] mywindow = new int[26];
        int s1l = s1.length();
        for(char c:s1.toCharArray()){
            s1p[c-'a']++;
        }
        char[] s2c = s2.toCharArray();
        for(int i=0;i<s2.length();++i){
            if(i>=s1l) mywindow[s2c[i-s1l]-'a']--;
            mywindow[s2c[i]-'a']++;
            if(Arrays.equals(s1p,mywindow)){
                return true;
            }
        }
        return false;

    }
}