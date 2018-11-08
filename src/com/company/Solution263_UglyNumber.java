package com.company;

public class Solution263_UglyNumber {
    public static void main(String[] args) {

    }
    public boolean isUgly(int num) {
        while(num%2==0){
            num/=num;
        }
        while(num%3==0){
            num/=num;
        }
        while(num%5==0){
            num/=num;
        }
        if(num==1) return true;
        else return false;

    }
}
