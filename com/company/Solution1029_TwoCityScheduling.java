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
        Arrays.sort(costs,(a,b)->(a[0]-a[1])-(b[0]-b[1]));
        int count=0;
        int ans=0;
        while (count<costs.length){
            if (count<costs.length/2)
                ans+=costs[count++][0];
            else
                ans+=costs[count++][1];
        }
        return ans;

    }
}
