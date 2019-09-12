package com.company;

public class Solution509_FibonacciNumber {
    public static void main(String[] args) {

    }
    public int fib(int N) {
        if(N<2) return N;
        int[] nums = new int[N+1];
        nums[0] = 0;
        nums[1] =1;
        for(int i=2;i<=N;++i){
            nums[i] = nums[i-1]+nums[i-2];
        }
        return nums[N];
    }
}
