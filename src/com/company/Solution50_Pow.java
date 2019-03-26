package com.company;

public class Solution50_Pow {
    public static void main(String[] args) {

        double x = 2;
        int n=-3;
        double s =myPow(x,n);
        double i =s*s;
    }
    public static double myPow(double x, int n) {
        if(n==-1) return x=1/x;
        if(n==0) return 1;
        if(n==1) return x;

        if(n%2==0) {
            double half = myPow(x,n/2);
            return half*half;
        }
        else {
            double half = myPow(x,(n-1)/2);
            return half*half*x;
        }
    }
}
