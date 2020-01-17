package com.company.CompanyList.Oracle;

import java.util.HashMap;
import java.util.Map;

public class Tokenizer {
    public static void main(String[] args) {
        String x = "12+34+0+1";
        tokenIt(x);
    }
    public static Map<String,String> tokenIt(String s){
        Map<String,String> res = new HashMap<>();
        int num=0;
        for (int i=0;i<s.length();++i){
            char ch = s.charAt(i);
            if (Character.isDigit(ch)){
                num = num*10+(ch-'0');
            }
            else {
                res.put(String.valueOf(num),"number");
                res.put(String.valueOf(ch),"operator");
                num = 0;
            }
        }
        if (num!=0)
            res.put(String.valueOf(num),"number");
        return res;
    }
}
