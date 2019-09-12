package com.company;

public class Solution762 {

    public static void main(String[] args) {
        countPrimeSetBits(244,269);

    }
    public  static int countPrimeSetBits(int L, int R) {
        int count =0;
        for(int i =L;i<=R;i++){
            if(isPrime(Integer.bitCount(i))){
                count++;
                System.out.println(Integer.bitCount(i));
            }
        }
        return count;
    }

    public static boolean isPrime(int n) {
        //check if n is a multiple of 2
        if(n==2) return true;
        if (n%2==0||n==1) return false;
        //if not, then just check the odds
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
