package com.company.CompanyList.Bloomberg;

import java.util.Arrays;

public class IfAnagram {
    public static void main(String[] args) {

    }
    public boolean check(char[] a, char[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        return a==b;
    }
    public int changeToAnagram(char[] s, char[] t){
        int[] countS = new int[s.length];
        int[] countT = new int[t.length];
        for (int i=0;i<t.length;++i){
            countT[t[i]-'a']++;
            countS[s[i]-'a']++;
        }
        int res =0;
        for (int i=0;i<countS.length;++i){
            if (countS[i]>countT[i]){
                res+=countS[i]-countT[i];
            }
        }
        return res;

    }
}
