package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Solution1029_TwoCityScheduling {
    public static void main(String[] args) {

    }
    /*
Greedy problems usually look like "Find minimum number of something to do something" or
"Find maximum number of something to fit in some conditions",
and typically propose an unsorted input.
    */
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o1[0]-o1[1])-(o2[0]-o2[1]);
            }
        });
        int totalCost=0;
        for (int i=0;i<costs.length;++i){
            if (i<costs.length/2) totalCost+=costs[i][0];
            else totalCost+=costs[i][1];
        }
        return totalCost;
    }
}
