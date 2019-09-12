package com.company;

public class Solution504_Base7 {
    public static void main(String[] args) {
        int x =100;
        convertToBase7(x);
    }
    public static String convertToBase7(int num) {
        boolean neg =false;
        if(num<0){
            num=-num;
            neg = true;
        }
        String result="";
        int pow = 0;
        while(num/Math.pow(7,pow)>=7){
            pow++;
        }
        for(int i=pow;i>=0;--i){
            int bit = num/(int)Math.pow(7,i);
            result+=Integer.toString(bit);
            num -=bit*(int)Math.pow(7,i);
        }
        if(neg) return "-"+result;
        else return result;
    }
}
