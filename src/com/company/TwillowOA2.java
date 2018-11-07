package com.company;

import java.util.ArrayList;
import java.util.List;

public class TwillowOA2 {
    public static void main(String[] args) {
        String a = "I I like like";
        String b = "I like";
        missingWords(a,b);
    }

    public static List<String> missingWords(String a, String b){
        String[] ca = a.split(" ");
        String[] cb = b.split(" ");
        List<String> result = new ArrayList<>();
        boolean contain =false;
        for(int i=0; i < ca.length; i++){
            for(int j=0;j<cb.length;++j){
                if(cb[j].equals(ca[i])){
                    contain =true;
                    cb[j] ="";
                    break;
                }
            }
            if(!contain) result.add(ca[i]);
            contain =false;
        }
        return result;
    }
}
