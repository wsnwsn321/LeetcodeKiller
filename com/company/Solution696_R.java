package com.company;

public class Solution696_R {
    public static void main(String[] args) {

        String a = "10101";
        countBinarySubstrings(a);
    }
    public static int countBinarySubstrings(String s) {
        int result=0;
        char[] cs = s.toCharArray();
        int i=0;
        while(i<cs.length){
            int count1 = checkConseq(i,cs);
            int count2 = checkConseq(i+count1,cs);
            result+=Math.min(count1,count2);
            i=i+count1;
        }
        return result;
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
