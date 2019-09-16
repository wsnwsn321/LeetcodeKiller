package com.company.Sap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CutSeeds {
    public static void main(String[] args) {

    }
    public boolean cutSeed(int[][] groud,int H,int V,int seedTotal){
        Set<Integer> hSet = new HashSet<>();
        Set<Integer> vSet = new HashSet<>();

        int consecutive=1;
        int seedPerGrid = seedTotal/(H+1)*(V*1);
        //verticle cut
        for (int i=0;i<groud.length-1;++i){
            for(int j=0;j<groud[0].length-1;++j){
                if (j+1<groud[0].length&&groud[i][j]==1&&groud[i][j+1]==1){
                    consecutive++;
                    if (consecutive>seedPerGrid) {
                        vSet.add(j);
                        consecutive=1;
                    }
                }
            }
        }
        consecutive=1;
        //horizontal cut
        for (int j=0;j<groud[0].length-1;++j){
            for(int i=0;i<groud.length-1;++i){
                if (i+1<groud.length&&groud[i][j]==1&&groud[i+1][j]==1){
                    consecutive++;
                    if (consecutive>seedPerGrid) {
                        hSet.add(j);
                        consecutive=1;
                    }
                }
            }
        }
        return V==vSet.size()&&H==hSet.size();
    }
}
