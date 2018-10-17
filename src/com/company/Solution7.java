package com.company;

public class Solution7 {
    public static void main(String[] args) {

        int x =1534236469;
        reverse(x);
    }
    public static int reverse(int x) {
        if(x>=0&&x<10) return x;
        String s = Integer.toString(x);
        String reversed = "";
        for(int i=s.length()-1;i>-1;--i){
            reversed+=s.charAt(i);
        }
        while(reversed.charAt(0)=='0'){
            reversed = reversed.substring(1);
        }
        if(reversed.charAt(reversed.length()-1)=='-'){
            reversed="-"+reversed.substring(0,reversed.length()-1);
        }

        int result = 0;
        try {
            result = Integer.parseInt(reversed);
        } catch (NumberFormatException e) {
            // act accordingly
            return 0;
        }
        return result;
    }
}
