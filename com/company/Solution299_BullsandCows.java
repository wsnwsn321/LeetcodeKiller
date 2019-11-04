package com.company;

public class Solution299_BullsandCows {
    public static void main(String[] args) {
        String a = "1122";
        String b = "1222";
        System.out.println(getHint(a,b));
    }
    public static String getHint(String secret, String guess) {
        int[] count = new int[10];
        int b=0,c=0;
        for (int i=0;i<secret.length();++i){
            if (secret.charAt(i)==guess.charAt(i)){
                b++;
            }
            else {
                if (count[secret.charAt(i)-'0']++==0)
                    c++;
                if (count[guess.charAt(i)-'0']--==0)
                    c++;
            }
        }
        return b+"A"+c+"B";
    }
}
