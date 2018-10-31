package com.company;

public class Solution204 {
    public static void main(String[] args) {
        int x = 10;
        countPrimes(x);
    }
    public static int countPrimes(int n) {
        boolean[] primes = new boolean[n];
        int count =0;
        if(n<2) return 0;
        for(int i=2;i<primes.length;++i){
            primes[i] = true;
        }
        for(int i=2;i*i<n;++i ){
            //if(i%2==0&&i!=2) continue;
            if(!primes[i]) continue;
            for(int j=i*i;j<n;j+=i){
                primes[j]=false;
            }
        }
        for(boolean x: primes){
            if(x) count++;
        }

        return count;
    }
}
