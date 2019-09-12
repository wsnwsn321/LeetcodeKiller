package com.company;

public class Solution856_ScoreofParentheses {
    public static void main(String[] args) {

    }
    public int scoreOfParentheses(String S) {
       return  score(S,0,S.length());
    }
    public  int score(String s,int l,int r){
        if(r-l==1) return 1;
        int balance =0;
        for(int i=l;i<r;++i){
            if(s.charAt(i)=='(') balance++;
            if(s.charAt(i)==')') balance--;
            if(balance==0){
                return 2*score(s,l,i)+score(s,i+1,r);
            }
        }
        return 2*score(s,l+1,r-1);

    }

}
