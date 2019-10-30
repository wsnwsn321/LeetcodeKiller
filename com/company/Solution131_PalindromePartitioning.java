package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution131_PalindromePartitioning {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> partition(String s) {
        backtrakcing(s,0,new ArrayList<>());
        return res;

    }
    public void backtrakcing(String s, int pos, List<String> temp){
        if (pos==s.length()){
            res.add(new ArrayList<>(temp));
        }
        for (int i=pos;i<s.length();++i){
            if (isPalindrome(s,pos,i)){
                temp.add(s.substring(pos,i+1));
                backtrakcing(s,i+1,temp);
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
