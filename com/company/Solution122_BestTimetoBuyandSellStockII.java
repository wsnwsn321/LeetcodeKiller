package com.company;

public class Solution122_BestTimetoBuyandSellStockII {
    public static void main(String[] args) {
        int[] p = new int[]{1,2,3,4,5};
        maxProfit(p);

    }
    public static int maxProfit(int[] prices) {
        if(prices.length==0) return 0;
        int previous =prices[0];
        int profit =0;
        for(int x:prices){
            if(x>previous) {
                profit+=x-previous;
                previous =x;
            }
            else{
                previous = x;
            }
        }
        //profit+=currentMax-low;
        //if(profit<0) return 0;
        return profit;
    }

}
