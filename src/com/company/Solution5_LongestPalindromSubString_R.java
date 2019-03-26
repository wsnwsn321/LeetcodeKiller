package com.company;

public class Solution5_LongestPalindromSubString_R {
    public static int lo,maxLen;
    public static void main(String[] args) {
        String s = "abacd";
        longestPalindrome(s);

    }
    public static String longestPalindrome(String s) {
        int l =0,r=1;
        char[] cs = s.toCharArray();
        int[] res = new int[2];
        int max =0;
        if(s.length()<=1) return s;
        while(l<s.length()){
            if(r==s.length()-1){
                if(ifPalindrome(l,r,cs)){
                    return s.substring(l,r+1);
                }
                l++;
                r = l+1;
                if(r>s.length()-1) break;
            }
            else if(ifPalindrome(l,r,cs)){
                if(max<r-l){
                    max = r-l;
                    res[0]=l;
                    res[1] =r;
                }
                r++;
            }
            else{
                r++;
            }
        }
        return s.substring(res[0],res[1]+1);
    }
    public static boolean ifPalindrome(int l, int r, char[] cs){
        while(l<r){
            if(cs[l++]!=cs[r--]) return false;
        }
        return true;
    }

}
