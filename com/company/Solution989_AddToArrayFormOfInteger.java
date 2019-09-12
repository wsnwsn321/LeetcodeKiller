package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution989_AddToArrayFormOfInteger {
    public static void main(String[] args) {

    }
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> res = new ArrayList<>();
        int length = String.valueOf(K).length();
        int[] B = new int[length];
        int carrier = 0;
        int pos = A.length-1;
        while(K>0||pos>=0){
            int reminder = K%10;
            int sum=0;
            if(pos>=0){
                sum = reminder+A[pos--]+carrier;
            }
            else{
                sum = reminder+carrier;
            }
            if(sum>=10){
                res.add(0,sum-10);
                carrier =1;

            }else{
                res.add(sum);
                carrier =0;
            }
            K/=10;
        }
        if(carrier==1) res.add(0,1);
        return res;


    }
}
