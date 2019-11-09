package com.company.CompanyList.Amazon;

public class LongestSubstringWithKUniqueCharacters {
    public static void main(String[] args) {
        String x = "aabacbebebe";
        kUniques(x,3);
    }
    public static int kUniques(String s, int k) {
        if (k==1&&s.length()>1) return 1;
        if (s.length()==0) return 0;
        int[] count = new int[26];
        int unique=0;
        int l=0,r=1;
        count[s.charAt(l)-'a']++;
        unique++;
        int res =0;
        while (r<s.length()){
            char cur = s.charAt(r);
            if (count[cur-'a']==0) unique++;
            count[cur-'a']++;
            if (unique==k){
                res = Math.max(res,r-l+1);
                r++;
            }
            else if (unique>k){
                count[s.charAt(l)-'a']--;
                if (count[s.charAt(l)-'a']==0) unique--;
                l++;
            }
            else {
                r++;
            }
        }
        return res;
    }
}
