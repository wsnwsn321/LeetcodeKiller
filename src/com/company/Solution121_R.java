package com.company;

public class Solution121_R {
    public static void main(String[] args) {

    }
    public static int maxProfit(int[] prices) {
        int low=Integer.MAX_VALUE;
        int high = 0;
        int profit =0;
        int result =0;
        for(int x:prices){
            if(x<low) low = x;
            else{
                profit = x-low;
            }
            if(profit>result) result =profit;
        }
        return result;
    }

}
