package com.company;

public class Solution66_PlusOne {
    public static void main(String[] args) {

    }
    //time:     O(n)
    //space:    O(1)
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1]!=9){
            digits[digits.length-1]+=1;
            return digits;
        }
        int last = digits.length-1;
        while(digits[last]==9&&last>0){
            digits[last]=0;
            last--;
        }
        if(last==0&&digits[last]==10){
            int[] newDigit = new int[digits.length+1];
            newDigit[0]=1;
            for(int i=1;i<newDigit.length;++i) newDigit[i] =0;
            return newDigit;
        }
        else{
            digits[last]+=1;
            return digits;
        }
    }
}
