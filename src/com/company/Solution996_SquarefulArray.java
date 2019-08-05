package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution996_SquarefulArray {
    public static void main(String[] args) {

    }
    public int numSquarefulPerms(int[] A) {
       return backtracking(new ArrayList<>(),0,A);
    }
    public int backtracking(List<Integer> temp, int count, int[] A){
        if(temp.size()==A.length&&checkPerfectSquare(temp)){
            count++;
            return count;
        }
        for(int i=0;i<A.length;++i){
            if(!temp.contains(i)){
                temp.add(A[i]);
                backtracking(temp,count,A);
                temp.remove(temp.size()-1);
            }
        }
        return count;
    }

    public boolean checkPerfectSquare(List<Integer> temp){
        for(int i=0;i<temp.size()-1;++i){
            int x = temp.get(i)+temp.get(i+1);
            double sr = Math.sqrt(x);
            // If square root is an integer
            if ((sr - Math.floor(sr)) != 0)
                return false;
        }
        return true;

    }

}
