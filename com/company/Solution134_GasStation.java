package com.company;

public class Solution134_GasStation {
    public static void main(String[] args) {

    }
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int minIndex =0;
        int gasLeft=0,totalGas=0;
        for (int i=0;i<gas.length;++i){
            totalGas+=gas[i]-cost[i];
            gasLeft+=gas[i]-cost[i];
            if (gasLeft<0){
                minIndex = i+1;
                gasLeft=0;
            }

        }
        return totalGas>=0?minIndex:-1;
    }
}
