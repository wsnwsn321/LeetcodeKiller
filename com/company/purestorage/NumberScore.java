package com.company.purestorage;

public class NumberScore {
    public static void main(String[] args) {
        compute_num_score(11123);
    }
    public static int compute_num_score(int num){
        String numStr = String.valueOf(num);
        int res =0;
        char[] cnum = numStr.toCharArray();
        int index=0;int consecutive=0;int count1=0;
        //cond4
        if (num%7==0) res+=1;
        while (index<cnum.length){
            //cond 1
            if (cnum[index]-'0'==9) {
                res+=4;
            }
            //cond 2
            if ((cnum[index]-'0')%2==0)res+=2;
            //cond 3
            if (index==0||(index>0&&cnum[index-1]==cnum[index]-1)){
                consecutive++;
            }
            else {
                res+=(int)Math.pow(consecutive,2);
                consecutive=1;
            }
            //cond5
            if((index==0||index>0&&cnum[index-1]==cnum[index])&&cnum[index]=='1'){
                count1++;
            }
            else {
                res+=count1>1?(5+5*(count1-2)):0;
                count1=0;
            }
            index++;
        }
        res+=(int)Math.pow(consecutive,2);
        res+=count1>1?(5+5*(count1-2)):0;
        return res;
    }
}
