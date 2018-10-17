package com.company;

public class Solution14 {
    public static void main(String[] args) {
        String[] k = new String[]{"flower","flow","flight"};
        longestCommonPrefix(k);

    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        if(strs.length==1) return strs[0];
        String result = strs[0];
        for(int i=1;i<strs.length;++i){
            String current = strs[i];
            if(result.length()>current.length()) result = findAmongTwo(current,result);
            else result = findAmongTwo(result,current);
            if(result.length()==0) return "";
        }
        return result;

        }
    public static String findAmongTwo(String s, String l){
        String compare = l.substring(0,s.length());
        while(!compare.equals(s)&&s.length()>0){
            s= s.substring(0,s.length()-1);
            compare = l.substring(0,s.length());
        }
        return s;
    }
}
