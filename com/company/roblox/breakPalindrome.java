package com.company.roblox;

public class breakPalindrome {
    public static void main(String[] args) {
        System.out.println(bk("asdsa"));
    }
    public static String bk(String palindrome){
        int i=0;
        while (i<palindrome.length()/2){
            char cur = palindrome.charAt(i);
            if (cur=='a') i++;
            else{
                palindrome = palindrome.substring(0,i)+'a'+palindrome.substring(i+1);
                return palindrome;
            }
        }
        palindrome = palindrome.substring(0,palindrome.length()-1)+'b';
        return palindrome;

    }
}
