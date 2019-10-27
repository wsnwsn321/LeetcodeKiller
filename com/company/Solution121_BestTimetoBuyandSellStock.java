package com.company;

public class Solution121_BestTimetoBuyandSellStock {
    public static void main(String[] args) {

    }
    public static int maxProfit(int[] prices) {
       int min = prices[0];
       int res=0;
       for (int i=1;i<prices.length;++i){
           if (prices[i]<min){
               prices[i] = min;
           }
           else {
               res  = Math.max(res,prices[i]-min);
           }
       }
       return res;
    }

}
