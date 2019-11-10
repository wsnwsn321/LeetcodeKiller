package com.company;

public class Solution696_CountBinarySubstrings {
    public static void main(String[] args) {

        String a = "10101";
        countBinarySubstrings(a);
    }
    public static int countBinarySubstrings(String s) {
        int res=0;
        char[] cs = s.toCharArray();
        int r =0;
        int con1 = checkConseq(r,cs);
        while (r<s.length()){
            int con2 = checkConseq(r+con1,cs);
            res+=Math.min(con1,con2);
            r = r+con1;
            con1 = con2;
        }
        return res;
    }

    public static int checkConseq(int p,char[] cs) {
        int current=p;
        if(p>cs.length-1){
            return 0;
        }
        while (current+1<cs.length&&cs[current + 1] == cs[p]) {
                current++;
        }
            return current-p+1;

    }
}
