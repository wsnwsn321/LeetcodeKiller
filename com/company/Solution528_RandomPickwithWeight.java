package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Solution528_RandomPickwithWeight {
    public static void main(String[] args) {

    }
    class Solution {
        int total;
        List<Integer> sum;
        Random rand;
        public Solution(int[] w) {
            total =0;
            sum = new ArrayList<>();
            rand = new Random();
            for (int n:w){
                total+=n;
                sum.add(total);
            }
        }

        public int pickIndex() {
            int picked = rand.nextInt(total);
            int l =0,r = sum.size()-1;
            while (l!=r){
                int mid = l+(r-l)/2;
                if (picked>=sum.get(mid)){
                    //use l=mid+1 here because when the target > mid, it can only falls in section greater than the current one( which is mid)
                    l = mid+1;
                }
                else r = mid;
            }
            return l;
        }
    }

}
