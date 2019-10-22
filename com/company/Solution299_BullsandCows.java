package com.company;

public class Solution299_BullsandCows {
    public static void main(String[] args) {
        String a = "1122";
        String b = "1222";
        System.out.println(getHint(a,b));
    }
    public static String getHint(String secret, String guess) {
        int cows =0,bulls=0;
        int[] count = new int[10];
        for (int i=0;i<secret.length();++i){
            int s = secret.charAt(i)-'0';
            int g = guess.charAt(i)-'0';
            if (s==g) {
                bulls++;
            }
            else {
                if (count[s]++ < 0) cows++;
                if (count[g]-- > 0) cows++;
            }
        }
        return bulls+"A"+cows+"B";

    }
}
