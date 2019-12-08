package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution406_QueueReconstructionbyHeight {
    public static void main(String[] args) {

    }
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b)->a[0]==b[0]?a[1]-b[1]:a[0]-b[0]);
        List<int[]> resList = new ArrayList<>();
        for (int[] p:people){
            resList.add(p[1],p);
        }
        return resList.toArray(new int[resList.size()][2]);
    }
}
