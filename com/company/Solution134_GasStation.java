package com.company;

public class Solution134_GasStation {
    public static void main(String[] args) {

    }
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total_tank =0,cur_tank =0,start_i=0;
        for (int i=0;i<gas.length;++i){
            total_tank+=gas[i]-cost[i];
            cur_tank = gas[i] -cost[i];
            if (cur_tank<0){
                start_i+=1;
                cur_tank =0;
            }
        }
        return total_tank>=0?start_i:-1;
    }
}
