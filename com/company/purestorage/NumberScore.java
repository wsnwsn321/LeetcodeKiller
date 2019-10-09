package com.company.purestorage;

import java.util.ArrayList;
import java.util.List;

public class NumberScore {
    public static void main(String[] args) {
        compute_num_score(11111);
    }
    public static int compute_num_score(int num){
        String numStr = String.valueOf(num);
        int res =0;
        char[] cnum = numStr.toCharArray();
        int index=0;
        //cond4
        if (num%7==0) res+=1;
        while (index<cnum.length){
            //cond 1
            if (cnum[index]-'0'==9) {
                res+=4;
            }
            //cond 2
            if ((cnum[index]-'0')%2==0)res+=2;
            //cond5
            if(index>0&&cnum[index-1]==cnum[index]&&cnum[index]=='1'){
                res+=5;
            }
            index++;
        }
        res+=getConsecutives(cnum);
        return res;
    }
    public static int getConsecutives(char[] cnum){
        int i=0;
        int count=1;
        int res=0;
        while (i<cnum.length-1){
            while (i<cnum.length-1&&cnum[i]==cnum[i+1]-1) {
                count++;
                i++;
            }
            res+=Math.pow(count,2);
            count=1;
            i++;
        }
        if (cnum.length==1||cnum[cnum.length-2]!=cnum[cnum.length-1]-1) res+=1;
        return res;
    }
}
