package com.company;

public class Solution680_ValidPalindromeII {
    public static void main(String[] args) {

    }
    public boolean validPalindrome(String s) {
        int l=0,r = s.length()-1;
        while (l<r){
            if (s.charAt(l)==s.charAt(r)){
                l++;r--;
            }
            else {
                return isPalindrome(s,l+1,r) ||isPalindrome(s,l,r-1);
            }
        }
        return true;
    }
    public boolean isPalindrome(String s, int l, int r){
        while (l<r){
            if (s.charAt(l)!=s.charAt(r))
                return false;
            l++;r--;
        }
        return true;
    }
}
