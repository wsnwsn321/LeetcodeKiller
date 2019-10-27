package com.company.Google;

import java.util.List;
import java.util.Random;
import java.util.Set;

public class NonDupCard {
    public static void main(String[] args) {

    }
    public int[][] solution(List<List<Integer>> restriction){
        int[][] res  = new int[5][5];
        Random rand = new Random();
        for (int i=0;i<5;++i){
            for (int j=0;j<5;++j){
                int cur = restriction.get(i).get(0)+rand.nextInt(restriction.get(i).get(restriction.get(i).size()-1));
                while (restriction.get(i).contains(cur)){
                    cur = restriction.get(i).get(0)+rand.nextInt(restriction.get(i).get(restriction.get(i).size()-1));
                }
                res[i][j] = cur;
            }
        }
        return res;
    }
}
