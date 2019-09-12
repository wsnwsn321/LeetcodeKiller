package com.company;

public class Solution121_R {
    public static void main(String[] args) {

    }
    public static int maxProfit(int[] prices) {
        int low =Integer.MAX_VALUE,profit=0,max=0;
        for(int x: prices){
            if(x<low){
                low =x;
            }
            else{
                profit = x-low;
            }
            max = Math.max(profit,max);
        }
        return max;
    }

}
