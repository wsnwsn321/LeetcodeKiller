package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution131_PalindromePartitioning {
    List<List<String>> ret = new ArrayList<>();
    public List<List<String>> partition(String s) {
        backtrack(s,new ArrayList<>(),0 );
        return ret;

    }
    public void backtrack(String s, List<String> temp,int pos){
        if(pos==s.length()){
            ret.add(new ArrayList<>(temp));
            return;
        }
        for (int i=pos;i<s.length();++i){
            if(isPalindrome(s,pos,i)){
                temp.add(s.substring(pos,i+1));
                backtrack(s,temp,i+1);
                temp.remove(temp.size()-1);
            }
        }


    }
    public boolean isPalindrome(String s,int left,int right){
        while(left<right&&s.charAt(left)==s.charAt(right)){
            left++;
            right--;
        }
        return left>=right;
    }
}
