package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution907_SumofSubarrayMinimums {
    public static void main(String[] args) {

    }
    int module = (int)Math.pow(10,9)+7;
    int ans=0;
    List<List<Integer>> res = new ArrayList<>();
    public int sumSubarrayMins(int[] A) {
        return 0;
    }
    public void backtracking(int[] A, int index, List<Integer> temp){
        res.add(new ArrayList<>(temp));
        for (int i=index;i<A.length;++i){
            temp.add(A[i]);
            backtracking(A,index+1,temp);
            temp.remove(temp.size()-1);
        }
    }
}
