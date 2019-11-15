package com.company;

public class Solution856_ScoreofParentheses {
    public static void main(String[] args) {

    }
    public int scoreOfParentheses(String S) {
        return score(S,0,S.length()-1);
    }
    public int score(String s,int l,int r){
        int balance =0;
        //condition ()
        if (r-l==1) return 1;
        //loop before the last character
        for (int i=l;i<r;++i){
            if (s.charAt(i)=='(')
                balance++;
            if (s.charAt(i)==')')
                balance--;
            //condition AB
            if (balance==0){
                return score(s,l,i)+score(s,i+1,r);
            }
        }
        //condition (A)
        return 2*score(s,l+1,r-1);
    }


}
