package com.company.Broadway;

import java.util.HashMap;
import java.util.Map;

public class changeBase {
    private static String numStr = "0123456789abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
        convertBase("12",10,16);
    }
    public static String convertBase(String num, int b1, int b2){
        long decimal = MtoDecimal(num,b1);
        return DecimatoNl(decimal,b2);
    }

    public static long MtoDecimal(String number,int m){
      long decimal =0;
      for (int i=number.length()-1;i>=0;--i){
          int cur = numStr.indexOf(number.charAt(i));
          decimal+=(long)Math.pow(m,number.length()-1-i)*cur;
      }
      return decimal;
    }
    public static String DecimatoNl(long number,int n){
        String res = "";
        while (number>0){
            int cur = (int)number%n;
            res =  numStr.charAt(cur)+res;
            number/=n;
        }
        return res;
    }
}
