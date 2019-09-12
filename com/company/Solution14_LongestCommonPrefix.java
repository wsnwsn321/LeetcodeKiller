package com.company;

public class Solution14_LongestCommonPrefix {
    public static void main(String[] args) {
        String[] k = new String[]{"flower","flow","flight"};
        longestCommonPrefix(k);

    }
    //runtime:  O(s) s= characters of all string
    //space:    O(1)
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        String prefix = strs[0];
        for (int i=1;i<strs.length;++i){
            String cand = strs[i];
            while (cand.indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if (prefix.equals("")) return "";
            }
        }
        return prefix;

    }

}
