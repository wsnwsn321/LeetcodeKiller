package com.company;

public class Solution122_BestTimetoBuyandSellStockII {
    public static void main(String[] args) {
        int[] p = new int[]{1,2,3,4,5};
        maxProfit(p);

    }
    public static int maxProfit(int[] prices) {
        if (prices.length==0) return 0;
        int profit=0;
        int min = prices[0];
        for (int i=1;i<prices.length;++i){
            if (prices[i]<min){
                min  = prices[i];
            }
            else {
                profit+=prices[i-1]-min;
                min = prices[i];
            }
        }
        return profit;

    }

}
