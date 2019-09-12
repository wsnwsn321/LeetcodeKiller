package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution923_3SumWithMultiplicity {
    public static void main(String[] args) {

    }
    public int threeSumMulti(int[] num, int target) {
        long[] count = new long[300];
        for (int x: num)
            count[x]++;
        long ans = 0;
        for(int i=0;i<=target;++i){
            for(int j=i;j<=target;++j){
                int k = target -i-j;
                if(k<0||k>=count.length||k<j) continue;
                if(count[i]==0||count[j]==0||count[k]==0) continue;
                if(i==j&&j==k){
                    ans+=(count[i]-1)*(count[i]-2)*count[i]/6;
                }
                else if(i==j&&j!=k){
                    ans += count[i] * (count[i] - 1) / 2 * count[k];
                }
                else if(i!=j&&j==k){
                    ans += count[i] * count[j] * (count[j] - 1) / 2;
                }
                else{
                    ans+=count[i]*count[j]*count[k];
                }
            }
        }
        return (int)ans%1_000_000_007;
    }
}
