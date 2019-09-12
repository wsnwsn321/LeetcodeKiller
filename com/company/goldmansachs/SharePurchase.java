package com.company.goldmansachs;

import java.util.List;

public class SharePurchase {
    public static void main(String[] args) {
        String s = "BBB";
        int x=sharePurchase(s);
    }
    public static int sharePurchase(String s){
        int l=0;
        int times=0;
        for (int r=2;r<s.length();++r){
            String sub = s.substring(l,r+1);
            while (l<r&&sub.contains("A")&&sub.contains("B")&&sub.contains("C")){
                times+=1;
                l++;
                sub = s.substring(l,r+1);
            }
            l=0;
        }

        return times;
    }
}
