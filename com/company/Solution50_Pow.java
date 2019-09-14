package com.company;

public class Solution50_Pow {
    public static void main(String[] args) {
        //myPow(2,10);
    }
    //time:     O(logn)
    //space:    O(logn)
    public double myPow(double x, int n) {
        if (n>=0&&n<=1) return n==1?x:1;
        if(x==0||x==1) return x;
        if (n<0) {
            if (n == -2147483648) {
                n = -(n+1);
                x = 1 / (x*x);

            } else {
                n = -n;
                x = 1 / x;

            }
        }
        return helper(x,n);
    }
    public double helper(double x,int n){
        if (n==1) return x;
        double half =  helper(x,n/2);
        if (n%2==0){
            return half*half;
        }
        else  return half*half*x;

    }
}
