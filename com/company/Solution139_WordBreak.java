package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution139_WordBreak {
    public static void main(String[] args) {
        String s= "leetcode";
        List<String> l = new ArrayList<>();
        l.add("leet");
        l.add("code");
        wordBreak(s,l);

    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[0] =true;
        for(int i=1; i <= s.length(); i++){
            for(int j=0; j < i; j++){
                if(dp[j] && wordDict.contains(s.substring(j, i))){
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }

}
