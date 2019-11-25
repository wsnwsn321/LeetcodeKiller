package com.company;

public class Solution866_PrimePalindrome {
    public static void main(String[] args) {

    }
    public int primePalindrome(int N) {
        while (!isPrime(N+1)||!isP(N)){
            N++;
            if (10_000_000 < N && N < 100_000_000)
                N = 100_000_000;
        }
        return N;
    }
    public boolean isP(int n){
        if (n<0) return false;
        int temp = n;
        int res=0;
        while (temp>0){
            res = res*10+temp%10;
            temp/=10;
        }
        return res==n;
    }
    public Boolean isPrime(int x) {
        if (x < 2 || x % 2 == 0) return x == 2;
        for (int i = 3; i * i <= x; i += 2)
            if (x % i == 0) return false;
        return true;
    }
}
