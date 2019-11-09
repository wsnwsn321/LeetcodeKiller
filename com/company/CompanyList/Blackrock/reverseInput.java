package com.company.CompanyList.Blackrock;

import java.util.Map;

public class reverseInput {
    Map<String,Float> m;
    public static void main(String[] args) {
        String s ="ABcd,9323.d=f";
        reverseInput(s);
    }
    public static String reverseInput(String s){
        String t = "";
        for (int i=s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            if (c>=48&&c<=57||c>=65&&c<=90||c>=97&&c<=122){
                t+=c+"-";
            }
        }
        return t.substring(0,t.length()-1);
    }
}
