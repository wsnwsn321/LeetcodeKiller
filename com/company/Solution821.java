package com.company;

public class Solution821 {
    public static void main(String[] args) {
    String a = "loveleetcode";
    shortestToChar(a,'e');
    }
    public static int[] shortestToChar(String S, char C) {

        int[] result = new int[S.length()];
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)==C){
                result[i] = 0;
            }
            else{
                result[i]=-1;
            }
        }
        for(int i=0;i<S.length();i++) {
            if (S.charAt(i) != C) {
                int aheadC = i;
                while (result[aheadC] != 0 && aheadC > 0) {
                    aheadC--;
                }
                result[i] = Math.min(Math.abs(i - S.indexOf(C, i)), Math.abs(i - S.indexOf(C, aheadC)));
            }
        }
            return result;
    }
}
