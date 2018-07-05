package com.company;

public class Solution476 {
    public static void main(String[] args) {
        int num =16;
        findComplement(num);
    }
    public static int findComplement(int num) {
        StringBuilder result = new StringBuilder(0);
    while (num>0){
        result.append(num%2);
        num /=2;
    }
    result.reverse();
    String newR= result.toString();
    newR = newR.replace('1','a');
    newR = newR.replace('0','1');
    newR = newR.replace('a','0');
    int numResult =0;
    for(int i=newR.length()-1;i>=0;i--){
        if(Integer.parseInt(newR.substring(i,i+1))==1){
            numResult+=Math.pow(2,newR.length()-1-i);
        }
    }
    return numResult;
    }
}